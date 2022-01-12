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
    s0 p1;
    s1(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s1> p0;
    std::vector<std::vector<s1>> p1;
    s2(std::vector<s1> v0, std::vector<std::vector<s1>> v1): p0(v0), p1(v1) { }
  };
  s0 f11(const s0 &v0) {
    s0 v4 = v0;
    s0 v2 = v4;
    s0 v3 = v4;
    const std::vector<std::vector<double>> v11 = v3.p0;
    v2.p0 = v11;
    const std::vector<double> v6 = v11[0];
    const std::vector<std::vector<double>> v5 = v4.p0;
    const std::vector<double> v8 = v5[1];
    const std::vector<std::vector<double>> v9 = v2.p0;
    std::vector<double> v10 = v6;
    const std::vector<std::vector<double>> v7 = v0.p0;
    std::vector<std::vector<double>> v24 = v9;
    const std::vector<std::vector<double>> v16 = v2.p0;
    const double v28 = v8[0];
    v2.p0 = v7;
    double v17 = v28;
    v4.p0 = v11;
    v24[1] = v10;
    v4.p0 = v16;
    double v26 = v17;
    v10[0] = v28;
    v24[0] = v8;
    const s0 v22(v24, v24);
    v4 = v22;
    v10[0] = v26;
    v10[0] = v28;
    return v22;
  }
  __attribute__((noinline))
  double f0(const s2 &v0, const double &v1) {
    s2 v6 = v0;
    const std::vector<std::vector<s1>> v10 = v6.p1;
    const std::vector<std::vector<s1>> v7 = v0.p1;
    const std::vector<s1> v9 = v10[0];
    const std::vector<s1> v15 = v10[1];
    v6.p1 = v7;
    const s1 v5 = v9[0];
    s2 v30 = v0;
    const std::vector<s2> v11 { v6, v6, v30, v6, v30, v30 };
    const s2 v36 = v11[3];
    s1 v22 = v5;
    const std::vector<std::vector<s1>> v18 = v6.p1;
    const std::vector<s0> v23 = v22.p0;
    const std::vector<std::vector<s1>> v34 = v36.p1;
    const std::vector<s1> v20 = v34[2];
    const s1 v38 = v9[0];
    v22.p0 = v23;
    const s0 v53 = v23[1];
    const std::vector<std::vector<double>> v51 = v53.p0;
    const s0 v54 = v23[1];
    s1 v28 = v22;
    v22 = v28;
    v28 = v22;
    const std::vector<double> v24 = v51[1];
    const s0 v37 = v5.p1;
    const std::vector<s0> v55 = v5.p0;
    const s0 v103 = f11(v37);
    const s0 v65 = f11(v54);
    v6.p0 = v20;
    std::vector<s0> v40 = v55;
    v30.p1 = v18;
    const s0 v57 = f11(v37);
    v6.p1 = v34;
    const s0 v71 = f11(v65);
    v28.p0 = v40;
    v40[1] = v57;
    const s0 v73 = f11(v103);
    v6.p1 = v10;
    s1 v44 = v38;
    v40[0] = v103;
    v28.p1 = v71;
    const std::vector<s0> v80 = v44.p0;
    v28.p0 = v80;
    const s1 v56 = v15[0];
    v22.p1 = v71;
    const s0 v116 = v56.p1;
    v40[0] = v73;
    const double v157 = v24[0];
    v22.p1 = v116;
    return v157;
  }
  int main() {
    s2 v0({ { { { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } } }, { { { 4.0 }, { 5.0 } }, { { 6.0 }, { 7.0 } } } }, { { { 8.0 }, { 9.0 } }, { { 10.0 }, { 11.0 } } } } }, { { { { { { { 12.0 }, { 13.0 } }, { { 14.0 }, { 15.0 } } }, { { { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } } }, { { { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 } } } } }, { { { { { { 24.0 }, { 25.0 } }, { { 26.0 }, { 27.0 } } }, { { { 28.0 }, { 29.0 } }, { { 30.0 }, { 31.0 } } } }, { { { 32.0 }, { 33.0 } }, { { 34.0 }, { 35.0 } } } } }, { { { { { { 36.0 }, { 37.0 } }, { { 38.0 }, { 39.0 } } }, { { { 40.0 }, { 41.0 } }, { { 42.0 }, { 43.0 } } } }, { { { 44.0 }, { 45.0 } }, { { 46.0 }, { 47.0 } } } } } } });
    double v1(48.0);
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
