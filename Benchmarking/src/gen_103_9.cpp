  #include <vector>
  #include <iostream>
  #include <chrono>
  double f39(const double &v0) {
    double v1 = v0;
    double v6 = v1;
    const std::vector<double> v3 { v6 };
    const double v5 = v3[0];
    std::vector<double> v4 = v3;
    double v8 = v0;
    const double v10 = v4[0];
    std::vector<double> v2 = v4;
    const double v12 = v4[0];
    std::vector<double> v14 = v2;
    std::vector<double> v26 = v4;
    std::vector<double> v20 = v2;
    const double v13 = v14[0];
    v2[0] = v13;
    v2[0] = v10;
    const double v16 = v2[0];
    v26[0] = v16;
    const std::vector<std::vector<double>> v40 { v26, v20, v3 };
    v20[0] = v12;
    v14[0] = v5;
    const std::vector<double> v41 = v40[1];
    const double v49 = v41[0];
    v2[0] = v13;
    v14[0] = v8;
    return v49;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<double>> &v0, const double &v1) {
    const std::vector<double> v7 = v0[0];
    double v2 = v1;
    std::vector<double> v10 = v7;
    v10[0] = v1;
    v10[0] = v1;
    v10[0] = v2;
    const double v23 = v10[0];
    v10[0] = v23;
    const std::vector<double> v17 = v0[0];
    const double v36 = v10[0];
    const double v33 = v17[0];
    const double v40 = v33 / v36;
    const double v50 = f39(v40);
    return v50;
  }
  int main() {
    std::vector<std::vector<double>> v0({ { 0.0 }, { 1.0 }, { 2.0 } });
    double v1(3.0);
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
