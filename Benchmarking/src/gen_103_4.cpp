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
  s0 f32(const s0 &v0) {
    const std::vector<s0> v1 { v0, v0, v0, v0, v0 };
    s0 v7 = v0;
    s0 v5 = v7;
    s0 v6 = v5;
    const std::vector<std::vector<double>> v2 = v0.p0;
    const s0 v4 = v1[2];
    const s0 v13 = v1[3];
    std::vector<s0> v19 = v1;
    const std::vector<std::vector<double>> v20 = v13.p0;
    const std::vector<std::vector<double>> v11 = v4.p0;
    const std::vector<std::vector<double>> v23 = v13.p1;
    const s0 v16(v2, v23);
    const std::vector<std::vector<double>> v28 = v5.p0;
    const std::vector<std::vector<std::vector<double>>> v24 { v28, v11, v20, v2, v28, v28, v11 };
    const std::vector<std::vector<double>> v30 = v24[5];
    const s0 v41(v20, v23);
    v6.p0 = v20;
    const std::vector<std::vector<double>> v35 = v6.p1;
    const s0 v26 = v19[2];
    const s0 v14 = v19[3];
    const s0 v40 = v19[1];
    v19[0] = v13;
    v19[1] = v4;
    const std::vector<std::vector<double>> v73 = v40.p1;
    const s0 v47 = v1[0];
    s0 v44 = v14;
    v5.p1 = v73;
    const std::vector<std::vector<double>> v39 = v47.p0;
    v19[3] = v41;
    const std::vector<std::vector<double>> v54 = v44.p0;
    const std::vector<std::vector<double>> v64 = v16.p0;
    v5.p0 = v54;
    v44 = v7;
    v44.p1 = v35;
    v5.p1 = v73;
    const std::vector<std::vector<double>> v107 = v26.p1;
    std::vector<std::vector<double>> v78 = v30;
    v44.p0 = v39;
    const std::vector<std::vector<double>> v97 = v26.p1;
    v7.p1 = v23;
    const s0 v244(v78, v107);
    v44.p0 = v64;
    v6.p1 = v97;
    return v244;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s1>> &v0, const double &v1) {
    const std::vector<s1> v3 = v0[1];
    const std::vector<s1> v7 = v0[1];
    std::vector<s1> v2 = v7;
    const s1 v4 = v2[0];
    const s1 v5 = v3[0];
    double v8 = v1;
    std::vector<s1> v11 = v2;
    const s1 v9 = v7[0];
    v11[0] = v9;
    s1 v18 = v5;
    v11[0] = v4;
    const s1 v23 = v11[0];
    v2[0] = v4;
    const s0 v20 = v23.p1;
    v2[0] = v18;
    const std::vector<std::vector<double>> v42 = v20.p0;
    const s0 v15 = f32(v20);
    v11 = v7;
    v18.p1 = v15;
    s1 v63 = v23;
    const std::vector<double> v19 = v42[2];
    v63.p1 = v20;
    const s0 v55 = f32(v20);
    const s0 v38 = f32(v15);
    v2[0] = v63;
    const double v77 = v19[0];
    const s0 v33 = v9.p1;
    double v49 = v8;
    v63.p1 = v33;
    const std::vector<std::vector<double>> v32 = v55.p1;
    const s0 v36 = f32(v38);
    v18.p1 = v36;
    std::vector<std::vector<double>> v29 = v32;
    std::vector<std::vector<double>> v52 = v32;
    const std::vector<std::vector<double>> v45 = v20.p0;
    const std::vector<std::vector<double>> v93 = v38.p1;
    std::vector<std::vector<double>> v40 = v45;
    const s0 v65(v40, v52);
    const std::vector<double> v46 = v32[0];
    const s0 v60 = f32(v20);
    v63.p1 = v65;
    const std::vector<double> v37 = v93[0];
    v52[0] = v37;
    const s0 v112 = f32(v60);
    const std::vector<double> v98 = v29[0];
    const double v194 = v49 + v77;
    v63.p1 = v112;
    v52[0] = v98;
    v40[0] = v46;
    return v194;
  }
  int main() {
    std::vector<std::vector<s1>> v0({ { { { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } } } }, { { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } } } } }, { { { { { { { 8.0 }, { 9.0 }, { 10.0 } }, { { 11.0 } } } } }, { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 } } } } } });
    double v1(16.0);
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
