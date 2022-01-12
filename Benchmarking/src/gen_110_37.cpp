  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    double p0;
    std::vector<double> p1;
    std::vector<std::vector<double>> p2;
    s0(double v0, std::vector<double> v1, std::vector<std::vector<double>> v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s1 {
    std::vector<s0> p0;
    s0 p1;
    s1(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    s1 p1;
    s2(s0 v0, s1 v1): p0(v0), p1(v1) { }
  };
  double f75(const double &v0) {
    double v5 = v0;
    double v1 = v5;
    double v7 = v1;
    double v2 = v7;
    double v8 = v1;
    double v4 = v5;
    double v10 = v1;
    double v6 = v1;
    double v13 = v2;
    double v9 = v0;
    double v21 = v5;
    double v39 = v13;
    double v36 = v9;
    const std::vector<double> v37 { v8, v39, v36, v4 };
    std::vector<double> v66 = v37;
    std::vector<double> v49 = v66;
    v66[3] = v10;
    std::vector<double> v44 = v49;
    v7 = v6;
    v2 = v21;
    v66[1] = v10;
    v66[2] = v2;
    std::vector<double> v91 = v44;
    std::vector<double> v58 = v91;
    const double v83 = v58[1];
    return v83;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s2>> &v0, const double &v1) {
    const double v7 = f75(v1);
    return v7;
  }
  int main() {
    std::vector<std::vector<s2>> v0({ { { { 0.0, { 1.0, 2.0, 3.0 }, { { 4.0 } } }, { { { 5.0, { 6.0, 7.0, 8.0 }, { { 9.0 } } } }, { 10.0, { 11.0, 12.0, 13.0 }, { { 14.0 } } } } } } });
    double v1(15.0);
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
