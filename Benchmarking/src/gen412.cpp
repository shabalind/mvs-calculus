  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<double> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<double> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    s0 p1;
    s2(s1 v0, s0 v1): p0(v0), p1(v1) { }
  };
  s0 f78(const s0 &v0) {
    const s1 v16(v0, v0);
    const std::vector<s1> v59 { v16, v16, v16, v16, v16, v16 };
    const s1 v19 = v59[4];
    const s0 v45 = v16.p1;
    const s0 v30 = v16.p1;
    std::vector<s1> v33 = v59;
    v33[0] = v19;
    const s1 v73 = v33[2];
    std::vector<s1> v38 = v59;
    const s0 v70 = v73.p1;
    std::vector<s1> v119 = v38;
    const s1 v86 = v119[4];
    const s1 v103(v30, v45);
    v119[2] = v103;
    v33[2] = v86;
    return v70;
  }
  s1 f66(const s1 &v0) {
    s1 v5 = v0;
    const s0 v2 = v0.p1;
    const s0 v4 = f78(v2);
    const s0 v3 = f78(v4);
    v5.p1 = v3;
    v5.p1 = v2;
    return v5;
  }
  s0 f19(const s0 &v0) {
    const s0 v7 = f78(v0);
    const std::vector<double> v8 = v0.p1;
    const std::vector<std::vector<double>> v4 = v0.p0;
    s0 v14 = v7;
    s0 v20 = v14;
    const s0 v13 = f78(v7);
    const s0 v25 = f78(v13);
    const s1 v19(v13, v25);
    v14.p0 = v4;
    const s1 v36 = f66(v19);
    const s0 v34 = v36.p1;
    v14.p1 = v8;
    v14.p1 = v8;
    const std::vector<std::vector<double>> v55 = v34.p0;
    v14.p0 = v55;
    const s0 v40 = f78(v20);
    v20 = v40;
    const s0 v107 = f78(v40);
    return v107;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s2>> &v0, const double &v1) {
    const std::vector<s2> v7 = v0[2];
    const s2 v4 = v7[0];
    const s1 v5 = v4.p0;
    const s1 v10 = f66(v5);
    s1 v17 = v10;
    s1 v18 = v10;
    const s0 v21 = v17.p0;
    v18.p1 = v21;
    const s0 v25 = v4.p1;
    const s1 v12 = f66(v18);
    v17.p0 = v25;
    const s0 v20 = v18.p0;
    v17.p1 = v20;
    s1 v33 = v12;
    const s0 v23 = f19(v20);
    const s0 v83 = v12.p1;
    const s0 v41 = v5.p0;
    v18 = v33;
    v33.p0 = v25;
    const s0 v31 = f78(v41);
    v18.p1 = v31;
    v18.p0 = v23;
    const std::vector<std::vector<double>> v82 = v83.p0;
    s0 v69 = v41;
    v33.p1 = v23;
    v18.p0 = v41;
    s0 v51 = v25;
    v17.p0 = v51;
    const std::vector<double> v63 = v82[0];
    v18.p1 = v69;
    const double v132 = v63[0];
    v18.p0 = v25;
    return v132;
  }
  int main() {
    std::vector<std::vector<s2>> v0({ { { { { { { 0.0 } }, { 1.0, 2.0 } }, { { { 3.0 } }, { 4.0, 5.0 } } }, { { { 6.0 } }, { 7.0, 8.0 } } } }, { { { { { { 9.0 } }, { 10.0, 11.0 } }, { { { 12.0 } }, { 13.0, 14.0 } } }, { { { 15.0 } }, { 16.0, 17.0 } } } }, { { { { { { 18.0 } }, { 19.0, 20.0 } }, { { { 21.0 } }, { 22.0, 23.0 } } }, { { { 24.0 } }, { 25.0, 26.0 } } } } });
    double v1(27.0);
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
