  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s0 p0;
    std::vector<s0> p1;
    s3(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  s3 f2(const s3 &v0) {
    s3 v5 = v0;
    s3 v3 = v5;
    const std::vector<s0> v4 = v3.p1;
    const s0 v6 = v5.p0;
    const std::vector<std::vector<double>> v10 = v6.p0;
    s3 v8 = v3;
    v3.p1 = v4;
    const s0 v7 = v4[0];
    v3.p1 = v4;
    s3 v2 = v8;
    const s0 v1 = v4[1];
    v2.p0 = v1;
    const std::vector<std::vector<double>> v13 = v7.p0;
    std::vector<std::vector<double>> v15 = v10;
    s0 v22 = v7;
    v15 = v13;
    const std::vector<s0> v19 = v3.p1;
    const std::vector<s0> v17 = v5.p1;
    const s0 v18 = v8.p0;
    const std::vector<double> v12 = v13[1];
    const std::vector<double> v14 = v13[0];
    v3.p0 = v18;
    v22.p0 = v15;
    const std::vector<double> v20 = v10[0];
    v15[0] = v14;
    v15[1] = v20;
    v15[0] = v14;
    v3.p1 = v17;
    v15[0] = v14;
    v2.p0 = v22;
    v15[1] = v12;
    v15[1] = v12;
    const std::vector<s0> v44 = v3.p1;
    const s0 v50 = v19[1];
    v22.p0 = v15;
    v8.p1 = v44;
    v8.p0 = v50;
    return v2;
  }
  __attribute__((noinline))
  double f0(const s3 &v0, const std::vector<s3> &v1, const double &v2) {
    const s3 v5 = v1[0];
    const s3 v7 = f2(v0);
    s3 v4 = v7;
    const s3 v9 = f2(v4);
    s3 v6 = v0;
    std::vector<s3> v13 = v1;
    const std::vector<s0> v18 = v5.p1;
    v6.p1 = v18;
    const s3 v12 = f2(v9);
    v4.p1 = v18;
    const s3 v27 = v13[0];
    v13[0] = v4;
    s3 v14 = v0;
    v13[0] = v0;
    const s3 v22 = f2(v7);
    const std::vector<s0> v38 = v6.p1;
    const std::vector<s0> v11 = v12.p1;
    const s0 v20 = v9.p0;
    const std::vector<std::vector<double>> v28 = v20.p0;
    const s0 v35 = v11[1];
    const s3 v25 = f2(v14);
    const s0 v23 = v14.p0;
    const s0 v48 = v38[0];
    v14.p0 = v48;
    v13[0] = v6;
    v6.p0 = v23;
    v4.p1 = v38;
    const s3 v33 = f2(v22);
    const std::vector<s0> v30 = v25.p1;
    const s3 v26 = f2(v6);
    const s3 v41 = f2(v26);
    const std::vector<double> v139 = v28[1];
    const std::vector<s0> v64 = v27.p1;
    const std::vector<s0> v49 = v0.p1;
    v4.p0 = v48;
    const s3 v88 = f2(v41);
    v6.p1 = v30;
    const double v62 = v139[0];
    const s3 v81 = f2(v33);
    v4.p1 = v49;
    const s3 v148 = f2(v88);
    v6.p0 = v35;
    v13[0] = v9;
    s3 v122 = v81;
    v4.p1 = v64;
    v13[0] = v122;
    v13[0] = v148;
    v6.p0 = v35;
    return v62;
  }
  int main() {
    s3 v0({ { { { 0.0 }, { 1.0 } }, { { 2.0 } } }, { { { { 3.0 }, { 4.0 } }, { { 5.0 } } }, { { { 6.0 }, { 7.0 } }, { { 8.0 } } } } });
    std::vector<s3> v1({ { { { { 9.0 }, { 10.0 } }, { { 11.0 } } }, { { { { 12.0 }, { 13.0 } }, { { 14.0 } } }, { { { 15.0 }, { 16.0 } }, { { 17.0 } } } } } });
    double v2(18.0);
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
