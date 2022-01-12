  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  double f30(const double &v0) {
    double v6 = v0;
    const double v3 = v6 * v0;
    const double v4 = v6 * v3;
    double v2 = v6;
    double v1 = v2;
    double v7 = v3;
    double v15 = v4;
    const std::vector<double> v21 { v15, v4 };
    std::vector<double> v22 = v21;
    v22[1] = v7;
    v22[0] = v0;
    v22[0] = v1;
    const double v13 = v22[0];
    v6 = v7;
    return v13;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const double &v1) {
    const double v4 = f30(v1);
    const double v12 = f30(v1);
    const double v7 = f30(v1);
    double v19 = v1;
    double v51 = v12;
    const double v30 = f30(v51);
    const std::vector<double> v38 { v51, v4, v19, v1, v30, v7 };
    const double v49 = v38[5];
    v51 = v1;
    std::vector<double> v56 = v38;
    const double v61 = f30(v1);
    v56[3] = v49;
    v56[3] = v61;
    std::vector<double> v74 = v56;
    const double v96 = v74[1];
    v74[1] = v7;
    return v96;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } } });
    double v1(4.0);
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
