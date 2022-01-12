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
    std::vector<std::vector<s0>> p0;
    std::vector<s1> p1;
    s2(std::vector<std::vector<s0>> v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  std::vector<s1> f35(const std::vector<s1> &v0, const s2 &v1) {
    s2 v8 = v1;
    const std::vector<std::vector<s0>> v13 = v8.p0;
    v8.p0 = v13;
    v8.p0 = v13;
    v8.p0 = v13;
    const std::vector<std::vector<s0>> v18 = v1.p0;
    const std::vector<std::vector<s0>> v42 = v8.p0;
    v8.p0 = v18;
    s2 v26 = v1;
    s2 v69 = v1;
    v26.p0 = v42;
    const std::vector<s1> v67 = v26.p1;
    v69.p0 = v18;
    v69.p1 = v0;
    v26.p1 = v0;
    v69.p1 = v67;
    const s1 v152 = v67[0];
    const std::vector<std::vector<s0>> v114 = v8.p0;
    const std::vector<std::vector<s0>> v59 = v26.p0;
    const std::vector<std::vector<s0>> v68 = v69.p0;
    std::vector<s1> v53 = v0;
    v8.p0 = v18;
    s2 v70 = v8;
    v69.p1 = v67;
    s2 v104 = v70;
    v69.p0 = v18;
    v104.p0 = v68;
    std::vector<s1> v164 = v0;
    v69.p0 = v13;
    v69.p1 = v164;
    const std::vector<s1> v151 = v104.p1;
    v8.p0 = v18;
    v8.p0 = v59;
    v164[1] = v152;
    v70.p0 = v42;
    v69.p0 = v114;
    v26.p1 = v53;
    return v151;
  }
  s2 f28(const s2 &v0) {
    const std::vector<std::vector<s0>> v7 = v0.p0;
    s2 v6 = v0;
    const std::vector<std::vector<s0>> v1 = v6.p0;
    s2 v2 = v0;
    std::vector<std::vector<s0>> v21 = v7;
    v2.p0 = v21;
    const std::vector<s1> v22 = v6.p1;
    v6.p0 = v1;
    const std::vector<std::vector<s0>> v27 = v0.p0;
    s2 v43 = v6;
    v2.p1 = v22;
    const std::vector<s1> v35 = f35(v22, v0);
    const std::vector<s1> v73 = v43.p1;
    v6.p0 = v1;
    const std::vector<std::vector<s0>> v81 = v2.p0;
    v43.p1 = v35;
    v6.p0 = v81;
    const s2 v125(v7, v73);
    v43.p1 = v73;
    v2.p0 = v27;
    return v125;
  }
  s2 f19(const s2 &v0) {
    const s2 v8 = f28(v0);
    const std::vector<std::vector<s0>> v3 = v8.p0;
    std::vector<std::vector<s0>> v6 = v3;
    const std::vector<s1> v14 = v0.p1;
    const s2 v22(v6, v14);
    return v22;
  }
  s1 f15(const s1 &v0) {
    s1 v8 = v0;
    return v8;
  }
  __attribute__((noinline))
  double f0(const std::vector<s2> &v0, const double &v1) {
    const s2 v2 = v0[0];
    const s2 v3 = f19(v2);
    const s2 v4 = f19(v3);
    const std::vector<s1> v19 = v4.p1;
    const s1 v42 = v19[2];
    const s1 v29 = f15(v42);
    const s0 v39 = v29.p1;
    const std::vector<std::vector<double>> v91 = v39.p0;
    const std::vector<double> v46 = v91[0];
    double v45 = v1;
    const double v219 = v46[0];
    const double v200 = v219 - v45;
    return v200;
  }
  int main() {
    std::vector<s2> v0({ { { { { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } } } }, { { { { { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } } }, { { { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } } }, { { { 12.0 } }, { { 13.0 }, { 14.0 }, { 15.0 } } } }, { { { { { { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } } }, { { { { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } } }, { { { 24.0 } }, { { 25.0 }, { 26.0 }, { 27.0 } } } }, { { { { { { 28.0 } }, { { 29.0 }, { 30.0 }, { 31.0 } } } }, { { { { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } } } } }, { { { 36.0 } }, { { 37.0 }, { 38.0 }, { 39.0 } } } } } } });
    double v1(40.0);
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
