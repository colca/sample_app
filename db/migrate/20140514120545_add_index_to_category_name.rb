class AddIndexToCategoryName < ActiveRecord::Migration
  def change
    add_index  :categories, :cName, unique: true
  end
end
