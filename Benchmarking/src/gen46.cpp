  #include <vector>
  #include <iostream>
  #include <chrono>
  __attribute__((noinline))
  double f0(const std::vector<std::vector<double>> &v0, const double &v1) {
    double v5 = v1;
    const double v13 = v5 + v1;
    const std::vector<double> v3 = v0[0];
    const double v6 = v3[0];
    std::vector<double> v10 = v3;
    double v21 = v6;
    std::vector<double> v11 = v10;
    std::vector<double> v15 = v3;
    std::vector<std::vector<double>> v8 = v0;
    v15[0] = v21;
    std::vector<double> v19 = v15;
    const std::vector<double> v48 = v8[0];
    v15[0] = v21;
    const double v25 = v19[0];
    const double v12 = v48[0];
    const double v14 = v21 + v1;
    v8 = v0;
    std::vector<double> v23 = v19;
    v19[0] = v25;
    const std::vector<double> v28 = v0[1];
    std::vector<std::vector<double>> v43 = v8;
    v21 = v12;
    v43[0] = v23;
    v10[0] = v13;
    double v54 = v5;
    v8[0] = v28;
    v15[0] = v14;
    const double v41 = v10[0];
    double v45 = v54;
    const std::vector<double> v86 = v43[0];
    v43[0] = v23;
    const double v72 = v86[0];
    double v82 = v72;
    v23 = v10;
    v8[0] = v11;
    v15[0] = v45;
    v11[0] = v41;
    return v82;
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
