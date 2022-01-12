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
  s1 f58(const s1 &v0, const std::vector<s0> &v1) {
    const std::vector<std::vector<s0>> v5 { v1, v1, v1, v1 };
    const std::vector<s0> v4 = v5[0];
    const s0 v10 = v1[1];
    const std::vector<std::vector<s0>> v9 { v1, v4 };
    const s0 v21 = v4[2];
    const std::vector<s0> v46 = v9[0];
    const std::vector<std::vector<double>> v12 = v10.p0;
    std::vector<std::vector<double>> v39 = v12;
    const std::vector<std::vector<double>> v14 = v21.p1;
    std::vector<std::vector<double>> v30 = v39;
    const std::vector<s0> v18 = v0.p1;
    std::vector<s0> v34 = v18;
    const std::vector<s0> v32 = v0.p1;
    std::vector<std::vector<double>> v61 = v14;
    s1 v31 = v0;
    const std::vector<double> v40 = v39[0];
    v31.p0 = v46;
    const std::vector<double> v29 = v30[0];
    const s0 v76 = v34[0];
    const std::vector<std::vector<double>> v63 = v76.p0;
    const s0 v83(v63, v61);
    std::vector<s0> v51 = v32;
    v61[0] = v29;
    const std::vector<s0> v170 = v0.p1;
    v39[0] = v40;
    v30[0] = v29;
    v31.p1 = v170;
    const std::vector<s0> v94 = v31.p1;
    v31.p0 = v4;
    s1 v65 = v31;
    v51[1] = v83;
    v65.p1 = v51;
    v65.p1 = v51;
    v65.p1 = v94;
    v31.p1 = v32;
    return v65;
  }
  s1 f55(const s1 &v0) {
    return v0;
  }
  s1 f47(const s1 &v0, const s0 &v1) {
    s1 v11 = v0;
    s1 v12 = v11;
    return v12;
  }
  s1 f43(const s1 &v0, const s1 &v1) {
    const std::vector<s0> v6 = v1.p0;
    const s1 v9 = f58(v0, v6);
    const s1 v22 = f55(v9);
    const s1 v59 = f55(v22);
    const std::vector<s0> v24 = v59.p0;
    const s1 v146 = f58(v9, v24);
    const s1 v101 = f55(v146);
    return v101;
  }
  s1 f35(const s1 &v0, const s1 &v1) {
    s1 v6 = v0;
    const std::vector<s0> v7 = v1.p0;
    const std::vector<s0> v5 = v6.p1;
    v6.p0 = v7;
    const s0 v4 = v7[0];
    s0 v11 = v4;
    std::vector<s0> v8 = v7;
    const std::vector<s0> v18 = v6.p0;
    const std::vector<std::vector<double>> v17 = v4.p1;
    const std::vector<std::vector<double>> v15 = v4.p1;
    std::vector<std::vector<double>> v21 = v17;
    const s0 v10 = v7[0];
    s0 v16 = v10;
    const s0 v12(v17, v15);
    v11.p0 = v15;
    v6.p0 = v7;
    const s0 v14 = v18[0];
    v8[2] = v10;
    v8[0] = v12;
    std::vector<std::vector<double>> v34 = v15;
    v8[0] = v10;
    const std::vector<double> v23 = v17[0];
    const s1 v52(v8, v5);
    v11.p1 = v34;
    v11.p1 = v21;
    const s1 v19 = f43(v0, v6);
    v21[0] = v23;
    const std::vector<std::vector<double>> v25 = v11.p1;
    v8[1] = v12;
    v11.p1 = v21;
    std::vector<std::vector<double>> v22 = v25;
    const std::vector<std::vector<double>> v42 = v16.p0;
    const std::vector<s0> v35 = v19.p0;
    const s0 v69(v42, v21);
    v22[0] = v23;
    const std::vector<double> v68 = v17[0];
    const s1 v50 = f47(v52, v4);
    v8 = v35;
    const s1 v54 = f47(v0, v69);
    v21[0] = v68;
    v16.p1 = v22;
    v16.p1 = v34;
    v11 = v14;
    const s1 v66 = f43(v50, v54);
    v8[1] = v69;
    return v66;
  }
  s1 f12(const s1 &v0) {
    const s1 v6 = f35(v0, v0);
    const std::vector<s0> v2 = v6.p1;
    const s1 v5 = f55(v0);
    const s1 v8 = f43(v6, v5);
    const std::vector<s0> v41 = v5.p0;
    const s1 v32 = f43(v8, v5);
    const s1 v56 = f35(v0, v32);
    s1 v126 = v56;
    v126.p1 = v2;
    v126.p0 = v41;
    const s1 v64 = f55(v126);
    return v64;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const std::vector<s1> &v1, const double &v2) {
    const s1 v6 = v1[1];
    const s1 v9 = f12(v6);
    const std::vector<s0> v8 = v9.p0;
    const s0 v28 = v8[0];
    const std::vector<std::vector<double>> v24 = v28.p0;
    const std::vector<double> v16 = v24[0];
    const double v23 = v16[0];
    return v23;
  }
  int main() {
    s0 v0({ { { 0.0 } }, { { 1.0 } } });
    std::vector<s1> v1({ { { { { { 2.0 } }, { { 3.0 } } }, { { { 4.0 } }, { { 5.0 } } }, { { { 6.0 } }, { { 7.0 } } } }, { { { { 8.0 } }, { { 9.0 } } }, { { { 10.0 } }, { { 11.0 } } } } }, { { { { { 12.0 } }, { { 13.0 } } }, { { { 14.0 } }, { { 15.0 } } }, { { { 16.0 } }, { { 17.0 } } } }, { { { { 18.0 } }, { { 19.0 } } }, { { { 20.0 } }, { { 21.0 } } } } }, { { { { { 22.0 } }, { { 23.0 } } }, { { { 24.0 } }, { { 25.0 } } }, { { { 26.0 } }, { { 27.0 } } } }, { { { { 28.0 } }, { { 29.0 } } }, { { { 30.0 } }, { { 31.0 } } } } } });
    double v2(32.0);
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
