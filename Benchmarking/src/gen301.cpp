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
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<std::vector<s0>> p0;
    s0 p1;
    s2(std::vector<std::vector<s0>> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s2 p0;
    std::vector<s1> p1;
    s3(s2 v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  s2 f40(const s2 &v0) {
    const s0 v3 = v0.p1;
    const std::vector<std::vector<double>> v1 = v3.p0;
    const s0 v4 = v0.p1;
    s2 v8 = v0;
    s2 v17 = v0;
    const std::vector<double> v7 = v1[1];
    s0 v9 = v4;
    v9.p0 = v1;
    const s0 v11 = v8.p1;
    v17.p1 = v11;
    v9.p0 = v1;
    s2 v30 = v17;
    const std::vector<std::vector<double>> v23 = v3.p1;
    const std::vector<std::vector<s0>> v37 = v8.p0;
    const std::vector<s0> v16 = v37[0];
    v9.p0 = v1;
    const s0 v36 = v30.p1;
    v8.p1 = v36;
    std::vector<std::vector<double>> v47 = v23;
    v9.p1 = v47;
    const s0 v72 = v16[0];
    v8.p1 = v9;
    v47[0] = v7;
    v8.p1 = v4;
    v8 = v30;
    v17.p1 = v11;
    v30.p1 = v72;
    return v8;
  }
  std::vector<s0> f33(const std::vector<s0> &v0) {
    const std::vector<std::vector<s0>> v1 { v0, v0, v0 };
    std::vector<std::vector<s0>> v7 = v1;
    v7 = v1;
    v7[1] = v0;
    v7 = v1;
    v7 = v1;
    v7[2] = v0;
    v7 = v1;
    const std::vector<s0> v26 = v7[2];
    return v26;
  }
  double f6(const s0 &v0, const std::vector<std::vector<s0>> &v1, const double &v2, const s0 &v3, const s3 &v4) {
    return v2;
  }
  s3 f3(const s3 &v0) {
    s3 v2 = v0;
    const s2 v5 = v2.p0;
    s3 v7 = v0;
    s2 v4 = v5;
    s3 v3 = v7;
    s3 v10 = v7;
    s2 v8 = v4;
    v3.p0 = v8;
    const s2 v9 = v3.p0;
    s3 v37 = v10;
    const s2 v30 = f40(v9);
    const s2 v16 = f40(v9);
    const std::vector<std::vector<s0>> v38 = v30.p0;
    const std::vector<s1> v25 = v7.p1;
    s3 v31 = v0;
    const std::vector<s0> v34 = v38[0];
    const std::vector<s0> v41 = f33(v34);
    const s0 v42 = v41[0];
    v37.p1 = v25;
    v37.p0 = v30;
    v10.p0 = v16;
    v7.p0 = v30;
    const s1 v24 = v25[0];
    v2.p0 = v16;
    v8.p1 = v42;
    std::vector<s1> v49 = v25;
    v49[0] = v24;
    v49[0] = v24;
    v10.p1 = v49;
    v10 = v0;
    v10.p1 = v49;
    v10 = v31;
    v10.p1 = v49;
    v49[0] = v24;
    return v37;
  }
  __attribute__((noinline))
  double f0(const s3 &v0, const std::vector<std::vector<s0>> &v1, const double &v2) {
    const s2 v8 = v0.p0;
    const std::vector<s0> v6 = v1[1];
    const std::vector<s0> v3 = v1[0];
    const s0 v7 = v8.p1;
    const s0 v5 = v3[0];
    s0 v10 = v5;
    const std::vector<std::vector<double>> v31 = v7.p1;
    const std::vector<double> v9 = v31[1];
    v10 = v5;
    const std::vector<std::vector<s0>> v29 { v3, v6, v3, v6, v3, v3, v6 };
    const s3 v12 = f3(v0);
    const double v18 = f6(v10, v1, v2, v10, v0);
    const std::vector<s0> v21 = v29[4];
    v10.p1 = v31;
    const std::vector<std::vector<double>> v40 = v10.p0;
    std::vector<std::vector<double>> v23 = v40;
    std::vector<std::vector<s0>> v41 = v1;
    const s0 v76 = v21[0];
    v23[0] = v9;
    v10.p1 = v40;
    const s3 v34 = f3(v12);
    v10.p1 = v23;
    v10.p1 = v40;
    v41[2] = v21;
    const s2 v65 = v0.p0;
    v41[0] = v21;
    const s0 v50 = v65.p1;
    v10.p1 = v23;
    const double v124 = f6(v50, v41, v18, v76, v34);
    return v124;
  }
  int main() {
    s3 v0({ { { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 }, { 5.0 } } } } }, { { { 6.0 }, { 7.0 }, { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } }, { { { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 }, { 16.0 }, { 17.0 } } }, { { { 18.0 }, { 19.0 }, { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } } } });
    std::vector<std::vector<s0>> v1({ { { { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 }, { 28.0 }, { 29.0 } } } }, { { { { 30.0 }, { 31.0 }, { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } } } }, { { { { 36.0 }, { 37.0 }, { 38.0 } }, { { 39.0 }, { 40.0 }, { 41.0 } } } } });
    double v2(42.0);
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
