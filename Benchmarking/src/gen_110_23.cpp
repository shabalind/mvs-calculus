  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<s0> p0;
    std::vector<std::vector<s0>> p1;
    s1(std::vector<s0> v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    s1 p0;
    std::vector<s0> p1;
    s5(s1 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s5 &v0, const double &v1) {
    const s1 v6 = v0.p0;
    const std::vector<std::vector<s0>> v13 = v6.p1;
    std::vector<std::vector<s0>> v11 = v13;
    std::vector<std::vector<s0>> v21 = v13;
    const std::vector<s0> v23 = v11[1];
    const std::vector<s0> v18 = v21[2];
    const s0 v22 = v23[0];
    const std::vector<std::vector<double>> v24 = v22.p0;
    const std::vector<double> v56 = v24[0];
    const std::vector<std::vector<double>> v44 { v56, v56, v56 };
    std::vector<std::vector<double>> v42 = v44;
    const std::vector<double> v79 = v42[1];
    v42 = v44;
    const double v125 = v79[0];
    std::vector<std::vector<double>> v285 = v44;
    const std::vector<double> v167 = v285[2];
    v11[2] = v18;
    v42 = v285;
    v285[2] = v167;
    return v125;
  }
  int main() {
    s5 v0({ { { { { { 0.0 } }, { { 1.0 }, { 2.0 } } } }, { { { { { 3.0 } }, { { 4.0 }, { 5.0 } } } }, { { { { 6.0 } }, { { 7.0 }, { 8.0 } } } }, { { { { 9.0 } }, { { 10.0 }, { 11.0 } } } } } }, { { { { 12.0 } }, { { 13.0 }, { 14.0 } } }, { { { 15.0 } }, { { 16.0 }, { 17.0 } } }, { { { 18.0 } }, { { 19.0 }, { 20.0 } } } } });
    double v1(21.0);
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
