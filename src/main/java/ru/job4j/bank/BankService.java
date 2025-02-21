package ru.job4j.bank;

import java.util.*;

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
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<Account> accounts = users.get(user.get());
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
    public Optional<User> findByPassport(String passport) {
        return users.keySet().stream()
                .filter(u -> u.getPassport().equals(passport))
                .findFirst();
    }

    /**
     * Метод позволяет получить банковский счет из коллекции
     * @param passport номер паспорта пользователя
     * @param requisite номер банковского счета
     * @return возращает банковский счет или null если счет в коллекции не найден
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            return users.get(user.get()).stream()
                    .filter(a -> a.getRequisite().equals(requisite))
                    .findFirst();
        }
        return Optional.empty();
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
        Optional<Account> srcAccount = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> desAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount.isPresent() && desAccount.isPresent()) {
            if (srcAccount.get().getBalance() >= amount) {
                desAccount.get().setBalance(desAccount.get().getBalance() + amount);
                srcAccount.get().setBalance(srcAccount.get().getBalance() - amount);
                return true;
            }
        }
        return false;
    }
}
