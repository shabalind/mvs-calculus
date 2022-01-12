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
  struct s2 {
    std::vector<std::vector<s0>> p0;
    std::vector<s0> p1;
    s2(std::vector<std::vector<s0>> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s2 p0;
    s1 p1;
    s4(s2 v0, s1 v1): p0(v0), p1(v1) { }
  };
  s2 f101(const s2 &v0) {
    s2 v1 = v0;
    const std::vector<std::vector<s0>> v5 = v0.p0;
    const std::vector<s0> v6 = v5[0];
    s2 v4 = v0;
    s2 v7 = v1;
    const std::vector<s0> v10 = v4.p1;
    const std::vector<s0> v2 = v1.p1;
    std::vector<s0> v8 = v2;
    const s0 v14 = v2[1];
    const std::vector<s0> v12 = v7.p1;
    v8[1] = v14;
    const std::vector<s0> v9 = v4.p1;
    const s2 v16(v5, v8);
    v8[1] = v14;
    const s0 v21 = v6[0];
    v8[1] = v14;
    v8[1] = v21;
    v7.p0 = v5;
    v7.p0 = v5;
    v1.p1 = v12;
    const std::vector<std::vector<s0>> v22 = v7.p0;
    v4.p0 = v22;
    v7.p1 = v10;
    const std::vector<s0> v36 = v16.p1;
    const std::vector<std::vector<s0>> v26 = v0.p0;
    v4.p0 = v26;
    v1.p1 = v36;
    v4.p0 = v5;
    v4.p0 = v26;
    v1.p1 = v10;
    const std::vector<std::vector<s0>> v77 = v16.p0;
    std::vector<s0> v47 = v9;
    const std::vector<s0> v81 = v7.p1;
    const s2 v97(v22, v81);
    v4.p1 = v12;
    v7.p0 = v77;
    s2 v98 = v97;
    std::vector<s0> v88 = v47;
    const std::vector<std::vector<s0>> v135 = v1.p0;
    v98.p0 = v135;
    v1.p1 = v88;
    return v98;
  }
  __attribute__((noinline))
  double f0(const s4 &v0, const double &v1) {
    s4 v3 = v0;
    const s1 v7 = v3.p1;
    const s2 v8 = v3.p0;
    v3.p1 = v7;
    const s2 v20 = f101(v8);
    v3.p0 = v20;
    const std::vector<s0> v28 = v20.p1;
    const s0 v162 = v28[1];
    const std::vector<std::vector<double>> v67 = v162.p1;
    const std::vector<double> v175 = v67[0];
    const double v177 = v175[0];
    return v177;
  }
  int main() {
    s4 v0({ { { { { { { 0.0 }, { 1.0 } }, { { 2.0 } } } } }, { { { { 3.0 }, { 4.0 } }, { { 5.0 } } }, { { { 6.0 }, { 7.0 } }, { { 8.0 } } }, { { { 9.0 }, { 10.0 } }, { { 11.0 } } } } }, { { { { { 12.0 }, { 13.0 } }, { { 14.0 } } } }, { { { { 15.0 }, { 16.0 } }, { { 17.0 } } } } } });
    double v1(18.0);
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
