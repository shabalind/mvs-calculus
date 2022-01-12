  #include <vector>
  #include <iostream>
  #include <chrono>
  std::vector<std::vector<double>> f8(const std::vector<std::vector<double>> &v0, const std::vector<std::vector<double>> &v1) {
    std::vector<std::vector<double>> v4 = v0;
    const std::vector<std::vector<std::vector<double>>> v3 { v0, v4, v4, v0, v1 };
    std::vector<std::vector<double>> v7 = v1;
    const std::vector<std::vector<double>> v6 = v3[4];
    std::vector<std::vector<double>> v8 = v7;
    std::vector<std::vector<std::vector<double>>> v9 = v3;
    v9[3] = v6;
    std::vector<std::vector<std::vector<double>>> v5 = v9;
    const std::vector<double> v11 = v8[0];
    v4[1] = v11;
    v9[1] = v1;
    std::vector<std::vector<std::vector<double>>> v17 = v9;
    const std::vector<std::vector<double>> v20 = v5[4];
    v17[3] = v20;
    std::vector<std::vector<std::vector<double>>> v42 = v5;
    v9 = v5;
    v9[3] = v4;
    v17 = v42;
    const std::vector<std::vector<double>> v39 = v17[3];
    std::vector<std::vector<double>> v51 = v1;
    v5[1] = v8;
    v17[0] = v51;
    return v39;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<double>> &v0, const double &v1) {
    const std::vector<std::vector<double>> v2 = f8(v0, v0);
    std::vector<std::vector<double>> v5 = v2;
    const std::vector<std::vector<double>> v9 = f8(v0, v5);
    const std::vector<double> v6 = v5[0];
    v5[1] = v6;
    const std::vector<double> v18 = v0[1];
    const std::vector<double> v11 = v5[1];
    const std::vector<std::vector<double>> v14 { v6, v6, v11, v6 };
    const std::vector<std::vector<double>> v10 = f8(v0, v9);
    v5[1] = v6;
    const std::vector<std::vector<double>> v15 = f8(v5, v10);
    const std::vector<std::vector<double>> v35 = f8(v9, v10);
    const std::vector<std::vector<double>> v21 = f8(v9, v35);
    std::vector<std::vector<double>> v22 = v14;
    const std::vector<std::vector<double>> v42 = f8(v15, v21);
    const std::vector<std::vector<double>> v33 = f8(v2, v42);
    const std::vector<double> v58 = v33[1];
    const double v48 = v58[0];
    const std::vector<double> v47 = v22[2];
    v22[1] = v18;
    const std::vector<double> v53 = v33[0];
    v5[1] = v47;
    v5[1] = v53;
    return v48;
  }
  int main() {
    std::vector<std::vector<double>> v0({ { 0.0 }, { 1.0 } });
    double v1(2.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
