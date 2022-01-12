  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<std::vector<s0>> p0;
    s0 p1;
    s1(std::vector<std::vector<s0>> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    s1 p1;
    s2(s1 v0, s1 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s2 &v0, const double &v1) {
    double v7 = v1;
    double v2 = v1;
    const std::vector<double> v26 { v1, v1, v1, v7, v2, v7, v7 };
    std::vector<double> v30 = v26;
    std::vector<double> v29 = v26;
    v29[6] = v1;
    const double v58 = v29[4];
    v29 = v30;
    v30[5] = v7;
    v30[6] = v2;
    double v242 = v58;
    double v198 = v242;
    return v198;
  }
  int main() {
    s2 v0({ { { { { { { 0.0 }, { 1.0 } }, { { 2.0 } } } } }, { { { 3.0 }, { 4.0 } }, { { 5.0 } } } }, { { { { { { 6.0 }, { 7.0 } }, { { 8.0 } } } } }, { { { 9.0 }, { 10.0 } }, { { 11.0 } } } } });
    double v1(12.0);
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
