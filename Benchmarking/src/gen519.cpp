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
  struct s3 {
    s1 p0;
    s1 p1;
    s3(s1 v0, s1 v1): p0(v0), p1(v1) { }
  };
  s3 f9(const s3 &v0) {
    const s1 v7 = v0.p1;
    s3 v3 = v0;
    const std::vector<s0> v1 = v7.p0;
    s3 v10 = v3;
    std::vector<s0> v24 = v1;
    s1 v12 = v7;
    v10.p0 = v7;
    const s1 v16 = v10.p0;
    const s0 v22 = v24[1];
    v10.p1 = v16;
    v24[1] = v22;
    v10.p0 = v12;
    v12.p0 = v24;
    v10 = v3;
    return v10;
  }
  s0 f4(const s0 &v0, const s3 &v1) {
    const s3 v2 = f9(v1);
    s3 v3 = v2;
    const std::vector<std::vector<double>> v6 = v0.p0;
    const std::vector<std::vector<std::vector<double>>> v8 { v6 };
    const std::vector<std::vector<double>> v7 = v0.p1;
    const s3 v15 = f9(v2);
    const s1 v10 = v3.p0;
    const s3 v12 = f9(v15);
    const s0 v9 = v10.p1;
    const std::vector<std::vector<double>> v25 = v9.p1;
    const s1 v19 = v1.p0;
    const std::vector<std::vector<double>> v27 = v8[0];
    const s1 v30 = v12.p1;
    v3.p0 = v19;
    std::vector<std::vector<double>> v42 = v25;
    v3.p1 = v10;
    const std::vector<s0> v22 { v9, v9, v0, v0 };
    std::vector<s0> v58 = v22;
    const s0 v70 = v10.p1;
    v3.p0 = v30;
    v3.p0 = v10;
    s1 v59 = v30;
    const s0 v81(v27, v42);
    const std::vector<s0> v29 = v10.p0;
    v3.p0 = v59;
    std::vector<s0> v44 = v29;
    v59.p1 = v70;
    v59.p0 = v29;
    v59.p0 = v44;
    v3.p1 = v10;
    v42 = v7;
    const s0 v83 = v58[3];
    v58[2] = v81;
    v44[2] = v9;
    v59.p1 = v0;
    return v83;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s1>> &v0, const double &v1) {
    double v7 = v1;
    const std::vector<s1> v6 = v0[0];
    const s1 v4 = v6[0];
    double v15 = v1;
    const s0 v11 = v4.p1;
    const s3 v29(v4, v4);
    const s0 v14 = f4(v11, v29);
    const std::vector<std::vector<double>> v16 = v14.p0;
    const double v17 = v7 - v15;
    const std::vector<double> v26 = v16[0];
    const double v25 = v26[0];
    const double v48 = v17 * v25;
    return v48;
  }
  int main() {
    std::vector<std::vector<s1>> v0({ { { { { { { 0.0 } }, { { 1.0 } } }, { { { 2.0 } }, { { 3.0 } } }, { { { 4.0 } }, { { 5.0 } } } }, { { { 6.0 } }, { { 7.0 } } } } }, { { { { { { 8.0 } }, { { 9.0 } } }, { { { 10.0 } }, { { 11.0 } } }, { { { 12.0 } }, { { 13.0 } } } }, { { { 14.0 } }, { { 15.0 } } } } }, { { { { { { 16.0 } }, { { 17.0 } } }, { { { 18.0 } }, { { 19.0 } } }, { { { 20.0 } }, { { 21.0 } } } }, { { { 22.0 } }, { { 23.0 } } } } } });
    double v1(24.0);
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
