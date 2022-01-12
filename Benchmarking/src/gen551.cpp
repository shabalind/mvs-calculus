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
    std::vector<s0> p0;
    s0 p1;
    s2(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s0 p0;
    s3(s0 v0): p0(v0) { }
  };
  s1 f40(const s1 &v0) {
    s1 v1 = v0;
    const s0 v2 = v0.p0;
    s1 v4 = v1;
    const s0 v8 = v0.p0;
    v4.p1 = v8;
    v1 = v4;
    v4.p1 = v8;
    v4.p1 = v2;
    const s0 v6 = v4.p0;
    s0 v3 = v8;
    const std::vector<std::vector<double>> v5 = v2.p0;
    const s0 v7 = v1.p1;
    v3.p0 = v5;
    const s0 v9 = v4.p1;
    const std::vector<s0> v14 { v7 };
    const s0 v38 = v0.p0;
    v4.p1 = v6;
    s1 v21 = v1;
    const std::vector<s0> v20 { v6, v38, v3, v2, v3, v38, v6 };
    s1 v17 = v21;
    const s0 v24 = v4.p0;
    std::vector<s0> v59 = v14;
    std::vector<s0> v42 = v20;
    v4.p0 = v38;
    v59[0] = v9;
    const s0 v58 = v20[6];
    const s0 v48 = v1.p1;
    s0 v68 = v24;
    std::vector<s0> v43 = v14;
    const s0 v32 = v17.p0;
    const s0 v149 = v59[0];
    const s0 v57 = v43[0];
    const s0 v85 = v0.p1;
    v43[0] = v6;
    v59[0] = v68;
    v17.p1 = v8;
    v43[0] = v149;
    v17.p1 = v57;
    const s0 v65 = v42[3];
    v17.p1 = v85;
    const s0 v91 = v59[0];
    v1.p1 = v24;
    s1 v103 = v1;
    const s0 v214 = v103.p1;
    v17.p0 = v48;
    const std::vector<std::vector<double>> v140 = v65.p1;
    s0 v97 = v91;
    v3.p1 = v140;
    v103.p1 = v9;
    const std::vector<std::vector<double>> v166 = v149.p1;
    v17.p1 = v214;
    const std::vector<std::vector<double>> v74 = v2.p1;
    v43[0] = v58;
    v1.p0 = v32;
    v97.p1 = v166;
    v42[3] = v97;
    v97.p1 = v74;
    v103.p0 = v24;
    return v103;
  }
  s0 f34(const s0 &v0) {
    return v0;
  }
  s3 f33(const s1 &v0, const s3 &v1) {
    const s0 v2 = v1.p0;
    s0 v7 = v2;
    const std::vector<std::vector<double>> v4 = v7.p1;
    const std::vector<std::vector<double>> v6 = v7.p1;
    const s0 v8 = f34(v2);
    const s1 v3 = f40(v0);
    v7 = v2;
    const s0 v10 = f34(v8);
    v7.p1 = v4;
    v7 = v8;
    const s0 v16 = f34(v10);
    v7.p1 = v4;
    const s0 v11 = v1.p0;
    s3 v21 = v1;
    const std::vector<std::vector<double>> v34 = v11.p0;
    const s1 v28 = f40(v3);
    const std::vector<std::vector<double>> v31 = v7.p0;
    const s0 v30(v34, v6);
    v21.p0 = v30;
    const s0 v37 = f34(v30);
    v7.p0 = v31;
    v21 = v1;
    v21.p0 = v8;
    const s0 v116 = f34(v16);
    v21.p0 = v116;
    const s0 v57 = v28.p0;
    v21.p0 = v57;
    v21.p0 = v37;
    return v21;
  }
  s1 f31(const s1 &v0) {
    const s1 v4 = f40(v0);
    const s1 v3 = f40(v0);
    s1 v6 = v4;
    const s1 v5 = f40(v0);
    const s0 v1 = v6.p0;
    s0 v7 = v1;
    const s1 v2 = f40(v0);
    const s0 v8 = v3.p0;
    s0 v11 = v7;
    const std::vector<std::vector<double>> v10 = v8.p1;
    const s0 v17 = f34(v7);
    std::vector<std::vector<double>> v12 = v10;
    s1 v13 = v5;
    v13.p0 = v17;
    const s0 v20 = f34(v17);
    const std::vector<std::vector<double>> v18 = v17.p0;
    const s1 v38 = f40(v2);
    const std::vector<double> v24 = v18[1];
    const s0 v19 = v3.p0;
    v13 = v5;
    const std::vector<std::vector<std::vector<double>>> v28 { v18 };
    v13.p1 = v20;
    v12[0] = v24;
    v12[0] = v24;
    const std::vector<std::vector<double>> v23 = v28[0];
    const std::vector<double> v27 = v23[1];
    const s0 v67 = v38.p0;
    v11.p0 = v23;
    v13.p0 = v11;
    v12[0] = v27;
    v13.p1 = v67;
    v12[0] = v27;
    const std::vector<std::vector<double>> v77 = v19.p1;
    v11 = v67;
    v7.p1 = v77;
    v11.p1 = v12;
    return v13;
  }
  s2 f13(const s2 &v0) {
    s2 v3 = v0;
    s2 v8 = v3;
    s2 v7 = v3;
    v7 = v8;
    const s0 v10 = v0.p1;
    v8.p1 = v10;
    v7.p1 = v10;
    s2 v14 = v7;
    return v14;
  }
  s0 f9(const s0 &v0, const std::vector<s0> &v1) {
    const s0 v2 = f34(v0);
    const std::vector<std::vector<double>> v19 = v0.p0;
    const s0 v4 = f34(v2);
    const s0 v12 = f34(v4);
    const std::vector<double> v11 = v19[1];
    const s0 v22 = f34(v12);
    const s0 v23 = f34(v12);
    const s0 v25 = f34(v0);
    const s2 v30(v1, v2);
    const s0 v17 = v1[0];
    std::vector<s0> v34 = v1;
    v34[0] = v25;
    v34[0] = v0;
    const std::vector<std::vector<double>> v39 = v22.p0;
    v34[0] = v25;
    v34[0] = v0;
    s0 v27 = v23;
    const s2 v42 = f13(v30);
    const s2 v24 = f13(v42);
    v34[0] = v12;
    v27.p0 = v39;
    const s0 v61 = v42.p1;
    s2 v67 = v42;
    const s0 v46 = v67.p1;
    const s2 v58 = f13(v24);
    const std::vector<std::vector<double>> v52 { v11 };
    const std::vector<s0> v95 { v4, v22, v12, v27, v4, v17 };
    std::vector<s0> v55 = v95;
    v67.p0 = v34;
    v34[0] = v17;
    v67.p1 = v23;
    v55[0] = v0;
    std::vector<s0> v128 = v34;
    std::vector<s0> v56 = v128;
    std::vector<s0> v72 = v56;
    const s0 v155 = f34(v46);
    v56[0] = v61;
    v128[0] = v4;
    s2 v106 = v58;
    v34[0] = v22;
    const s0 v107 = v106.p1;
    v27.p1 = v52;
    const s0 v77 = v55[3];
    v56[0] = v4;
    v55[3] = v46;
    v106.p1 = v17;
    v106.p0 = v72;
    v67.p1 = v77;
    const s0 v219 = f34(v107);
    v106.p0 = v72;
    v128[0] = v27;
    v34[0] = v155;
    return v219;
  }
  s3 f6(const s3 &v0, const s3 &v1) {
    const s0 v7 = v0.p0;
    s0 v4 = v7;
    const s0 v2 = f34(v7);
    const s0 v9 = f34(v4);
    const s0 v13 = v0.p0;
    const std::vector<std::vector<double>> v8 = v2.p0;
    const std::vector<std::vector<double>> v19 = v7.p1;
    s0 v12 = v9;
    s0 v14 = v12;
    std::vector<std::vector<double>> v20 = v8;
    v12.p1 = v19;
    s3 v29 = v1;
    const std::vector<double> v30 = v19[0];
    const std::vector<std::vector<std::vector<double>>> v33 { v8, v20, v20, v20, v20, v20, v8 };
    const std::vector<std::vector<double>> v34 = v14.p0;
    v12.p0 = v8;
    std::vector<double> v17 = v30;
    const std::vector<std::vector<double>> v38 = v33[3];
    const std::vector<std::vector<double>> v32 = v2.p1;
    const std::vector<double> v41 = v8[0];
    std::vector<std::vector<double>> v45 = v20;
    v12.p0 = v38;
    v20[1] = v17;
    v29.p0 = v14;
    const std::vector<double> v59 = v20[0];
    v4.p0 = v34;
    v20[0] = v59;
    const std::vector<double> v67 = v32[0];
    v14.p0 = v45;
    v29.p0 = v13;
    v45[1] = v67;
    v20[0] = v41;
    const s1 v154(v13, v7);
    v12.p0 = v20;
    const s3 v118 = f33(v154, v29);
    const s1 v64 = f31(v154);
    s1 v219 = v64;
    const s3 v222 = f33(v219, v118);
    return v222;
  }
  s0 f2(const s0 &v0) {
    const std::vector<s0> v6 { v0 };
    s0 v1 = v0;
    const s0 v8 = f34(v1);
    s0 v2 = v0;
    const s0 v3 = v6[0];
    s0 v5 = v0;
    const s0 v7 = v6[0];
    std::vector<s0> v4 = v6;
    const s0 v9 = f34(v5);
    const s0 v14 = v4[0];
    v4[0] = v7;
    s0 v10 = v0;
    const std::vector<std::vector<double>> v21 = v8.p0;
    std::vector<s0> v23 = v6;
    const s0 v52 = f9(v5, v23);
    const std::vector<std::vector<double>> v30 = v3.p0;
    v23[0] = v2;
    const std::vector<std::vector<double>> v22 = v14.p1;
    const std::vector<std::vector<double>> v39 = v52.p1;
    const s0 v49 = f34(v9);
    const s0 v29 = v4[0];
    const s0 v134 = f34(v29);
    const std::vector<std::vector<double>> v47 = v29.p0;
    const s3 v33(v0);
    const s3 v73 = f6(v33, v33);
    v1.p1 = v39;
    s3 v100 = v33;
    const s3 v62(v10);
    s3 v86 = v33;
    v100 = v62;
    const s1 v105(v49, v134);
    v2.p1 = v22;
    v10.p0 = v30;
    const s3 v88 = f33(v105, v100);
    s3 v64 = v86;
    const s1 v77 = f31(v105);
    v10.p0 = v47;
    std::vector<std::vector<double>> v106 = v21;
    const s3 v180 = f33(v77, v73);
    const s0 v115 = v77.p0;
    const s3 v258 = f6(v64, v88);
    v64.p0 = v115;
    v10.p0 = v106;
    s3 v211 = v180;
    v100.p0 = v10;
    const s3 v179 = f6(v211, v258);
    const s0 v214 = v179.p0;
    return v214;
  }
  __attribute__((noinline))
  double f0(const s3 &v0, const double &v1) {
    const s0 v3 = v0.p0;
    const s0 v26 = f2(v3);
    const std::vector<std::vector<double>> v34 = v26.p0;
    const std::vector<double> v16 = v34[0];
    const double v20 = v16[0];
    return v20;
  }
  int main() {
    s3 v0({ { { { 0.0 }, { 1.0 } }, { { 2.0 } } } });
    double v1(3.0);
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
