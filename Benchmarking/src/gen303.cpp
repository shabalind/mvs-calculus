  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    double p0;
    s0 p1;
    s2(double v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<std::vector<s2>> p0;
    s2 p1;
    s3(std::vector<std::vector<s2>> v0, s2 v1): p0(v0), p1(v1) { }
  };
  s0 f100(const std::vector<s2> &v0, const s0 &v1) {
    const std::vector<std::vector<double>> v4 = v1.p1;
    const std::vector<std::vector<double>> v3 = v1.p0;
    std::vector<s2> v7 = v0;
    const std::vector<double> v2 = v3[0];
    std::vector<double> v5 = v2;
    const std::vector<std::vector<double>> v11 = v1.p1;
    const s2 v6 = v7[0];
    const std::vector<std::vector<double>> v9 = v1.p0;
    v7[0] = v6;
    const s0 v18 = v6.p1;
    s0 v59 = v18;
    std::vector<double> v15 = v5;
    s2 v49 = v6;
    const double v32 = v15[0];
    v5[0] = v32;
    std::vector<std::vector<double>> v35 = v4;
    const s0 v30 = v49.p1;
    v59.p0 = v9;
    v59.p1 = v11;
    v49.p1 = v59;
    v49.p0 = v32;
    v7[0] = v49;
    s0 v21 = v30;
    v21.p1 = v35;
    v49.p0 = v32;
    v35[1] = v15;
    return v21;
  }
  std::vector<s2> f87(const std::vector<s2> &v0) {
    const std::vector<std::vector<s2>> v4 { v0 };
    const s2 v7 = v0[0];
    std::vector<s2> v3 = v0;
    const std::vector<s2> v1 = v4[0];
    s2 v8 = v7;
    const s0 v2 = v8.p1;
    s0 v10 = v2;
    const std::vector<s2> v19 = v4[0];
    const s0 v5 = f100(v1, v10);
    const s2 v14 = v19[0];
    std::vector<s2> v24 = v3;
    const s0 v12 = f100(v19, v10);
    const s2 v26 = v1[0];
    const std::vector<s2> v30 { v14, v7, v8, v8, v26 };
    v8.p1 = v12;
    const std::vector<std::vector<double>> v20 = v12.p0;
    const s0 v21 = f100(v24, v5);
    const s0 v45 = f100(v24, v10);
    v8.p1 = v21;
    const double v41 = v7.p0;
    const s2 v46 = v30[2];
    v10.p0 = v20;
    v8.p1 = v10;
    v3[0] = v7;
    std::vector<s2> v198 = v0;
    v198[0] = v46;
    v8.p1 = v45;
    v8.p0 = v41;
    return v198;
  }
  s0 f73(const s0 &v0) {
    s0 v3 = v0;
    const std::vector<std::vector<double>> v5 = v3.p0;
    const std::vector<double> v7 = v5[0];
    const double v2 = v7[0];
    const std::vector<double> v13 = v5[0];
    v3.p0 = v5;
    v3.p0 = v5;
    v3.p0 = v5;
    std::vector<std::vector<double>> v14 = v5;
    v14[0] = v13;
    const std::vector<double> v4 = v14[0];
    std::vector<std::vector<double>> v8 = v5;
    const std::vector<std::vector<double>> v9 = v3.p1;
    v14[0] = v7;
    const std::vector<std::vector<double>> v23 = v0.p1;
    std::vector<std::vector<double>> v19 = v23;
    const std::vector<double> v11 = v14[0];
    const std::vector<std::vector<double>> v34 = v3.p0;
    v3.p1 = v9;
    const std::vector<std::vector<double>> v20 = v0.p1;
    const std::vector<std::vector<double>> v15 = v0.p1;
    v14[0] = v4;
    const std::vector<std::vector<double>> v26 = v3.p1;
    const std::vector<double> v31 = v14[0];
    v3.p0 = v34;
    v3.p1 = v19;
    v3.p0 = v5;
    std::vector<std::vector<double>> v28 = v20;
    std::vector<double> v27 = v13;
    v3 = v0;
    s0 v64 = v0;
    std::vector<std::vector<double>> v37 = v5;
    const std::vector<double> v38 = v37[0];
    v19[1] = v38;
    s0 v41 = v64;
    v3.p1 = v28;
    v3.p0 = v14;
    v14[0] = v31;
    v64.p1 = v15;
    std::vector<double> v40 = v27;
    std::vector<std::vector<double>> v110 = v14;
    v37[0] = v11;
    v64.p1 = v26;
    const std::vector<std::vector<double>> v33 = v0.p0;
    const std::vector<double> v103 = v19[1];
    std::vector<double> v52 = v13;
    v19[1] = v52;
    const std::vector<double> v50 = v110[0];
    v64.p0 = v8;
    v41.p1 = v9;
    v28[0] = v50;
    v37[0] = v40;
    v14 = v33;
    v28[1] = v40;
    v19[1] = v103;
    v40[0] = v2;
    const std::vector<std::vector<double>> v53 = v3.p1;
    v64.p1 = v53;
    v64.p1 = v20;
    v19[1] = v7;
    return v41;
  }
  double f32(const double &v0) {
    double v2 = v0;
    const std::vector<double> v6 { v2, v0, v0, v0, v2, v0, v0 };
    const double v7 = v6[4];
    std::vector<double> v8 = v6;
    v8[0] = v7;
    const double v11 = v6[5];
    double v9 = v2;
    const double v10 = v6[2];
    const double v1 = v8[2];
    v8[4] = v9;
    v8[1] = v10;
    v8[0] = v11;
    v8[2] = v2;
    v8[5] = v11;
    v8[5] = v0;
    v8[2] = v1;
    std::vector<double> v86 = v8;
    const double v19 = v86[3];
    return v19;
  }
  __attribute__((noinline))
  double f0(const s3 &v0, const double &v1) {
    const std::vector<std::vector<s2>> v4 = v0.p0;
    const std::vector<s2> v6 = v4[0];
    const s2 v3 = v0.p1;
    const double v11 = f32(v1);
    const s2 v7 = v0.p1;
    const double v8 = v1 + v11;
    const double v10 = f32(v8);
    const std::vector<s2> v16 = f87(v6);
    const s2 v12 = v0.p1;
    const s0 v19 = v3.p1;
    const s0 v22 = v7.p1;
    const s2 v24 = v16[0];
    s2 v34 = v12;
    s2 v69 = v34;
    const double v44 = v69.p0;
    v69.p1 = v22;
    v69.p0 = v10;
    const s0 v54 = f73(v19);
    v69 = v24;
    v34.p1 = v22;
    const s0 v97 = v3.p1;
    v34.p1 = v97;
    v69.p1 = v54;
    return v44;
  }
  int main() {
    s3 v0({ { { { 0.0, { { { 1.0 } }, { { 2.0 }, { 3.0 } } } } } }, { 4.0, { { { 5.0 } }, { { 6.0 }, { 7.0 } } } } });
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
