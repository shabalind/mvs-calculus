  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<double> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<double> v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    s0 p0;
    std::vector<s0> p1;
    s5(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  std::vector<s5> f39(const std::vector<s5> &v0) {
    std::vector<s5> v6 = v0;
    std::vector<s5> v7 = v6;
    const s5 v5 = v7[0];
    const s5 v8 = v7[0];
    s5 v2 = v8;
    v6[0] = v8;
    const std::vector<s0> v25 = v5.p1;
    v7[0] = v8;
    const s0 v9 = v5.p0;
    std::vector<s5> v12 = v0;
    const s5 v13 = v6[0];
    s5 v18 = v8;
    const s5 v20 = v0[0];
    const std::vector<s0> v41 = v18.p1;
    v2.p1 = v41;
    v12[0] = v2;
    v2.p1 = v25;
    v18.p1 = v25;
    const std::vector<s0> v30 = v13.p1;
    v18.p1 = v30;
    s5 v58 = v20;
    v6[0] = v2;
    s0 v65 = v9;
    v12 = v7;
    v12[0] = v58;
    v58.p0 = v65;
    v6[0] = v13;
    std::vector<s5> v108 = v0;
    std::vector<s5> v48 = v108;
    const s5 v176 = v48[0];
    v58 = v176;
    v6 = v108;
    return v12;
  }
  __attribute__((noinline))
  double f0(const std::vector<s5> &v0, const double &v1) {
    const std::vector<s5> v3 = f39(v0);
    const s5 v6 = v3[0];
    const s5 v2 = v3[0];
    s5 v16 = v2;
    const std::vector<s0> v18 = v16.p1;
    v16.p1 = v18;
    const s0 v23 = v18[0];
    const s0 v20 = v6.p0;
    const std::vector<std::vector<double>> v10 = v23.p0;
    v16 = v6;
    s0 v14 = v23;
    const std::vector<double> v38 = v10[0];
    v16.p0 = v14;
    v16.p0 = v20;
    const std::vector<s0> v31 = v6.p1;
    const std::vector<std::vector<double>> v36 = v23.p0;
    const double v27 = v38[0];
    v14.p0 = v36;
    double v32 = v1;
    v32 = v27;
    v16.p1 = v31;
    v32 = v27;
    return v32;
  }
  int main() {
    std::vector<s5> v0({ { { { { 0.0 }, { 1.0 } }, { 2.0, 3.0 } }, { { { { 4.0 }, { 5.0 } }, { 6.0, 7.0 } } } } });
    double v1(8.0);
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
