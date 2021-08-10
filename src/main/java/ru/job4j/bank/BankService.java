package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает модель банковского сервиса
 */
public class BankService {
    /**
     * Хранение пользователей и соответствующих им банковских счетов
     * осуществляется в коллекции типа Map
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод принимает на вход пользователи и
     * добавляет его в коллекцию.
     * @param user пользователь, который добавряется в коллекцию
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод позволяет добавить банковский счет существующему пользователю
     * @param passport номер паспорта для поиска пользователя в коллекции
     * @param account банковский счет добавляемый пользователю
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Метот осуществляет поиск в коллекции пользователя
     * по указанному паспорту
     * @param passport номер паспорта
     * @return возврящает найденного пользователя или null если отсутствует в коллекции
     */
    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (passport.equals(user.getPassport())) {
                return user;
            }
        }
        return null;
    }

    /**
     * Метод позволяет получить банковский счет из коллекции
     * @param passport номер паспорта пользователя
     * @param requisite номер банковского счета
     * @return возращает банковский счет или null если счет в коллекции не найден
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            int index = accounts.indexOf(new Account(requisite, -1));
            if (index != -1) {
                return accounts.get(index);
            }
        }
        return null;
    }

    /**
     * Метод осуществляет перевод указанной суммы с обного банковского счета
     * на другой
     * @param srcPassport номер паспорта пользователя для списания суммы
     * @param srcRequisite номер банковского счета для списания суммы
     * @param destPassport номер паспорта пользователя для добавления суммы
     * @param destRequisite номер банковского счета для добавления суммы
     * @param amount сумма, которую необходимо перевести с одного счета на другой
     * @return возвращает true в случае успешного перевода, false если перевод не удался
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account desAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && desAccount != null && srcAccount.getBalance() >= amount) {
            desAccount.setBalance(desAccount.getBalance() + amount);
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            return true;
        }
        return false;
    }
}
