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
    std::vector<s0> p1;
    s1(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s1 &v0, const s1 &v1, const double &v2) {
    double v4 = v2;
    double v3 = v4;
    double v15 = v3;
    const double v7 = v3 + v15;
    const std::vector<double> v14 { v15, v3 };
    const double v29 = v14[1];
    std::vector<double> v33 = v14;
    const std::vector<std::vector<double>> v20 { v33, v14, v14 };
    v33[0] = v7;
    v33[1] = v29;
    std::vector<std::vector<double>> v48 = v20;
    const std::vector<double> v42 = v20[1];
    v33 = v42;
    const std::vector<double> v56 = v48[2];
    v48[2] = v42;
    std::vector<double> v144 = v56;
    v48[1] = v144;
    const double v81 = v56[0];
    v48[0] = v33;
    v144[0] = v7;
    return v81;
  }
  int main() {
    s1 v0({ { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } }, { { { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } } }, { { { 8.0 }, { 9.0 }, { 10.0 } }, { { 11.0 } } }, { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 } } } } });
    s1 v1({ { { { 16.0 }, { 17.0 }, { 18.0 } }, { { 19.0 } } }, { { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 } } }, { { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 } } }, { { { 28.0 }, { 29.0 }, { 30.0 } }, { { 31.0 } } } } });
    double v2(32.0);
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
