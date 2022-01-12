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
    std::vector<std::vector<s0>> p1;
    s1(s0 v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s7 {
    s1 p0;
    s7(s1 v0): p0(v0) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s7> &v0, const double &v1) {
    const s7 v15 = v0[0];
    const s1 v10 = v15.p0;
    const std::vector<std::vector<s0>> v36 = v10.p1;
    const double v31 = v1 + v1;
    const std::vector<s0> v26 = v36[0];
    const s0 v53 = v26[0];
    const std::vector<std::vector<double>> v74 = v53.p0;
    const std::vector<double> v92 = v74[0];
    const double v103 = v31 + v1;
    std::vector<double> v55 = v92;
    std::vector<double> v88 = v55;
    v55[0] = v103;
    const double v217 = v88[0];
    v55[0] = v31;
    return v217;
  }
  int main() {
    std::vector<s7> v0({ { { { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } }, { { { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } } }, { { { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } }, { { { { 12.0 } }, { { 13.0 }, { 14.0 }, { 15.0 } } } } } } }, { { { { { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } }, { { { { { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } }, { { { { 24.0 } }, { { 25.0 }, { 26.0 }, { 27.0 } } } }, { { { { 28.0 } }, { { 29.0 }, { 30.0 }, { 31.0 } } } } } } } });
    double v1(32.0);
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
