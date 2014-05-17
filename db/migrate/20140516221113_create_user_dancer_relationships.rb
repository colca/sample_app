class CreateUserDancerRelationships < ActiveRecord::Migration
  def change
    create_table :user_dancer_relationships do |t|
      t.integer :user_id
      t.integer :dancer_id

      t.timestamps
    end

    add_index :user_dancer_relationships, :user_id
    add_index :user_dancer_relationships, [:user_id, :dancer_id], unique: true
  end
end
