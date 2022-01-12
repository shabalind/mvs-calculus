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
    std::vector<s0> p1;
    s1(std::vector<s0> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s1> &v0, const double &v1) {
    const s1 v7 = v0[0];
    const s1 v2 = v0[0];
    const s1 v5 = v0[0];
    const std::vector<s0> v4 = v2.p1;
    s1 v6 = v7;
    const std::vector<s0> v10 = v7.p0;
    const std::vector<s0> v9 = v7.p0;
    s1 v8 = v6;
    v6.p0 = v9;
    v8.p1 = v4;
    const std::vector<s0> v18 = v8.p1;
    v6.p0 = v9;
    v8 = v5;
    std::vector<s0> v17 = v18;
    const s0 v14 = v18[0];
    v17[0] = v14;
    const std::vector<s0> v11 = v7.p0;
    const s1 v24 = v0[0];
    const s0 v28 = v9[2];
    v8.p0 = v10;
    const std::vector<s0> v16 = v24.p0;
    v6.p1 = v4;
    const s1 v22(v11, v18);
    v6.p0 = v16;
    const std::vector<std::vector<double>> v42 = v14.p1;
    const std::vector<double> v38 = v42[0];
    const std::vector<s0> v48 = v22.p0;
    const s0 v47 = v16[0];
    v6.p1 = v17;
    v8.p0 = v48;
    std::vector<s0> v37 = v18;
    v8.p1 = v37;
    v17[0] = v28;
    const double v27 = v38[0];
    v6.p0 = v48;
    v6.p0 = v48;
    v37[0] = v47;
    return v27;
  }
  int main() {
    std::vector<s1> v0({ { { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } } }, { { { 4.0 }, { 5.0 } }, { { 6.0 }, { 7.0 } } }, { { { 8.0 }, { 9.0 } }, { { 10.0 }, { 11.0 } } } }, { { { { 12.0 }, { 13.0 } }, { { 14.0 }, { 15.0 } } } } }, { { { { { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } }, { { { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 } } }, { { { 24.0 }, { 25.0 } }, { { 26.0 }, { 27.0 } } } }, { { { { 28.0 }, { 29.0 } }, { { 30.0 }, { 31.0 } } } } } });
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
