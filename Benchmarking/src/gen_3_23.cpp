  #include <vector>
  #include <iostream>
  #include <chrono>
  double f52(const double &v0) {
    double v1 = v0;
    double v2 = v0;
    double v4 = v1;
    double v8 = v0;
    double v5 = v1;
    double v3 = v8;
    double v14 = v2;
    double v12 = v5;
    double v10 = v5;
    double v9 = v14;
    double v24 = v5;
    const double v6 = v2 + v3;
    double v18 = v2;
    const double v15 = v8 / v6;
    double v11 = v4;
    const double v35 = v18 * v4;
    double v17 = v24;
    double v20 = v5;
    double v28 = v14;
    v10 = v20;
    double v25 = v12;
    double v23 = v28;
    double v21 = v6;
    const std::vector<double> v55 { v35, v17, v21, v28, v8, v10, v15 };
    const double v49 = v55[0];
    v23 = v49;
    const std::vector<double> v67 { v25, v11, v10 };
    const std::vector<std::vector<double>> v44 { v67, v67, v67, v67, v67, v67, v67 };
    std::vector<double> v57 = v67;
    v57[0] = v23;
    std::vector<std::vector<double>> v58 = v44;
    v58[0] = v57;
    const std::vector<double> v304 = v58[6];
    v57[2] = v9;
    const double v147 = v304[0];
    return v147;
  }
  double f34(const double &v0) {
    double v6 = v0;
    v6 = v0;
    const double v1 = f52(v6);
    const double v5 = f52(v1);
    double v7 = v5;
    double v2 = v1;
    const double v10 = f52(v2);
    const std::vector<double> v16 { v5, v1, v2, v0, v7, v10 };
    std::vector<double> v30 = v16;
    const double v23 = v30[4];
    v30[4] = v0;
    const double v51 = f52(v23);
    return v51;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<double>> &v0, const std::vector<double> &v1, const double &v2) {
    std::vector<double> v3 = v1;
    const double v6 = v1[0];
    v3[0] = v2;
    std::vector<double> v20 = v3;
    v20[0] = v6;
    double v9 = v6;
    double v24 = v2;
    v20[0] = v6;
    v3[0] = v24;
    double v17 = v9;
    v3[0] = v2;
    v20[0] = v24;
    v20[0] = v2;
    v20[0] = v17;
    std::vector<double> v10 = v20;
    const double v29 = v10[0];
    v10[0] = v6;
    const double v14 = v3[0];
    v20[0] = v14;
    v20[0] = v2;
    v20[0] = v24;
    double v99 = v2;
    const double v230 = f34(v24);
    v3[0] = v17;
    v3[0] = v9;
    v20[0] = v230;
    const double v128 = v29 + v99;
    return v128;
  }
  int main() {
    std::vector<std::vector<double>> v0({ { 0.0 }, { 1.0 }, { 2.0 } });
    std::vector<double> v1({ 3.0 });
    double v2(4.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
