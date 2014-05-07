FactoryGirl.define do
=begin  factory :user do
    name	"Michael Hartl"
    email	"michael@example.com"
    password	"foobar"
    password_confirmation  "foobar"
  end
=end
  factory :user do
    sequence(:name) { |n| "Pserson #{n}" }
    sequence(:email) { |n| "Person_#{n}@example.com"}
    password "foobar"
    password_confirmation "foobar"
    factory :admin do
      admin true
    end
  end
end
