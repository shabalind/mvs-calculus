  #include <vector>
  #include <iostream>
  #include <chrono>
  std::vector<std::vector<double>> f6(const std::vector<std::vector<double>> &v0, const std::vector<std::vector<double>> &v1) {
    const std::vector<double> v2 = v1[0];
    std::vector<std::vector<double>> v3 = v1;
    std::vector<std::vector<double>> v5 = v3;
    std::vector<std::vector<double>> v7 = v5;
    v3[1] = v2;
    const std::vector<double> v8 = v0[1];
    std::vector<double> v14 = v8;
    const double v10 = v2[0];
    v3 = v5;
    v14[0] = v10;
    v3[1] = v14;
    return v7;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<double>> &v0, const std::vector<std::vector<double>> &v1, const std::vector<std::vector<double>> &v2, const double &v3) {
    const std::vector<std::vector<double>> v11 = f6(v1, v1);
    const std::vector<double> v10 = v0[2];
    const std::vector<std::vector<double>> v12 = f6(v1, v1);
    std::vector<std::vector<double>> v16 = v1;
    const std::vector<std::vector<double>> v14 = f6(v11, v16);
    const std::vector<std::vector<double>> v18 = f6(v12, v1);
    v16[1] = v10;
    const std::vector<double> v27 = v14[1];
    const std::vector<double> v43 = v11[0];
    const std::vector<double> v79 = v18[0];
    const std::vector<double> v53 = v11[0];
    std::vector<double> v96 = v53;
    std::vector<double> v102 = v79;
    const std::vector<std::vector<double>> v146 { v79, v27, v96, v43, v102 };
    v16[0] = v96;
    const std::vector<double> v127 = v146[0];
    v16[0] = v127;
    const double v142 = v127[0];
    return v142;
  }
  int main() {
    std::vector<std::vector<double>> v0({ { 0.0 }, { 1.0 }, { 2.0 } });
    std::vector<std::vector<double>> v1({ { 3.0 }, { 4.0 } });
    std::vector<std::vector<double>> v2({ { 5.0 }, { 6.0 }, { 7.0 } });
    double v3(8.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
