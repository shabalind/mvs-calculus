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
  s1 f20(const s1 &v0) {
    s1 v7 = v0;
    const std::vector<s0> v3 = v0.p1;
    const std::vector<s0> v2 = v0.p1;
    v7.p1 = v2;
    const std::vector<s0> v28 = v0.p0;
    const std::vector<s0> v23 = v7.p1;
    const std::vector<s0> v29 = v0.p1;
    v7.p1 = v2;
    const std::vector<s0> v35 = v0.p1;
    v7.p1 = v29;
    v7.p1 = v3;
    v7.p1 = v23;
    s1 v47 = v7;
    v7.p1 = v35;
    v47.p0 = v28;
    s1 v86 = v47;
    return v86;
  }
  double f2(const double &v0, const s1 &v1) {
    const double v27 = v0 + v0;
    double v68 = v27;
    return v68;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s1>> &v0, const double &v1) {
    const std::vector<s1> v7 = v0[0];
    std::vector<std::vector<s1>> v8 = v0;
    const s1 v4 = v7[0];
    v8[0] = v7;
    const std::vector<s1> v2 = v0[0];
    const std::vector<s1> v9 = v0[0];
    const s1 v3 = f20(v4);
    const std::vector<s1> v5 = v8[0];
    v8[0] = v2;
    const s1 v6 = v5[0];
    v8[0] = v9;
    const double v20 = f2(v1, v3);
    v8[0] = v5;
    const std::vector<s1> v11 = v0[0];
    v8 = v0;
    v8[0] = v7;
    const std::vector<s0> v17 = v4.p1;
    s1 v24 = v3;
    v8[0] = v7;
    const double v32 = f2(v20, v4);
    const std::vector<s0> v18 = v6.p0;
    v8[0] = v5;
    v24.p0 = v18;
    s1 v19 = v6;
    const s1 v23 = f20(v19);
    s1 v30 = v6;
    v19.p0 = v18;
    v8[0] = v2;
    const double v55 = v20 * v32;
    std::vector<s1> v44 = v11;
    v44[0] = v30;
    s1 v33 = v23;
    const s1 v48 = f20(v33);
    const s1 v53 = f20(v48);
    v30 = v19;
    v33.p1 = v17;
    const double v50 = f2(v55, v53);
    v8[0] = v7;
    v8[0] = v44;
    const std::vector<s0> v57 = v24.p0;
    v8[0] = v44;
    v8[0] = v44;
    v8[0] = v11;
    v33.p0 = v57;
    return v50;
  }
  int main() {
    std::vector<std::vector<s1>> v0({ { { { { { { 0.0 } }, { { 1.0 }, { 2.0 } } } }, { { { { 3.0 } }, { { 4.0 }, { 5.0 } } }, { { { 6.0 } }, { { 7.0 }, { 8.0 } } } } } } });
    double v1(9.0);
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
