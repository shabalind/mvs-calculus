  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  double f12(const double &v0) {
    const double v2 = v0 + v0;
    double v7 = v2;
    const std::vector<double> v4 { v7, v0, v7 };
    const double v6 = v4[1];
    v7 = v0;
    double v3 = v2;
    const double v5 = v4[2];
    double v8 = v5;
    const double v13 = v4[1];
    std::vector<double> v1 = v4;
    std::vector<double> v10 = v4;
    v1[0] = v7;
    v10[1] = v3;
    const double v25 = v1[0];
    const std::vector<double> v23 { v6, v6, v7, v6, v13, v13, v6 };
    std::vector<double> v18 = v23;
    const double v9 = v23[1];
    const double v19 = v6 / v25;
    v1[2] = v6;
    v1[1] = v8;
    const double v21 = v2 + v7;
    std::vector<double> v37 = v10;
    const double v73 = v10[0];
    v18[6] = v19;
    std::vector<double> v38 = v23;
    std::vector<double> v20 = v18;
    const double v35 = v4[0];
    std::vector<double> v63 = v20;
    const double v48 = v37[1];
    v18[2] = v21;
    double v52 = v6;
    const double v56 = v38[1];
    v18[1] = v35;
    v38[6] = v48;
    v1[2] = v52;
    v20[4] = v56;
    v3 = v73;
    std::vector<double> v77 = v38;
    const double v148 = v63[4];
    v63[2] = v8;
    v18 = v77;
    v20[5] = v9;
    return v148;
  }
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const double &v1) {
    const double v21 = f12(v1);
    const double v17 = f12(v21);
    return v17;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } } }, { { { 5.0 }, { 6.0 } }, { { 7.0 }, { 8.0 }, { 9.0 } } } });
    double v1(10.0);
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
