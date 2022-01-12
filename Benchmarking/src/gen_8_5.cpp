  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s1> &v0, const s0 &v1, const double &v2) {
    const s1 v4 = v0[0];
    const std::vector<std::vector<double>> v8 = v1.p0;
    const s0 v12 = v4.p0;
    const std::vector<std::vector<double>> v14 = v12.p0;
    const std::vector<double> v19 = v14[1];
    std::vector<double> v39 = v19;
    std::vector<std::vector<double>> v38 = v8;
    v38[1] = v39;
    const std::vector<double> v165 = v38[0];
    const double v113 = v165[0];
    return v113;
  }
  int main() {
    std::vector<s1> v0({ { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } } }, { { { 5.0 }, { 6.0 }, { 7.0 } }, { { 8.0 }, { 9.0 } } } } });
    s0 v1({ { { 10.0 }, { 11.0 }, { 12.0 } }, { { 13.0 }, { 14.0 } } });
    double v2(15.0);
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
