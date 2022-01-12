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
  struct s2 {
    s0 p0;
    s1 p1;
    s2(s0 v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<s2> p0;
    s2 p1;
    s3(std::vector<s2> v0, s2 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    std::vector<std::vector<s3>> p0;
    s1 p1;
    s0 p2;
    s2 p3;
    s1 p4;
    std::vector<std::vector<s3>> p5;
    std::vector<s1> p6;
    s4(std::vector<std::vector<s3>> v0, s1 v1, s0 v2, s2 v3, s1 v4, std::vector<std::vector<s3>> v5, std::vector<s1> v6): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4), p5(v5), p6(v6) { }
  };
  double f24(const double &v0) {
    double v2 = v0;
    const double v9 = v2 * v0;
    double v5 = v2;
    double v4 = v9;
    double v7 = v5;
    double v13 = v9;
    const double v3 = v4 - v0;
    double v1 = v0;
    double v8 = v1;
    double v6 = v7;
    double v14 = v2;
    v7 = v0;
    double v10 = v3;
    double v11 = v2;
    double v17 = v5;
    double v21 = v13;
    double v23 = v17;
    double v19 = v5;
    double v20 = v21;
    double v22 = v1;
    double v35 = v10;
    const std::vector<double> v16 { v7 };
    std::vector<double> v15 = v16;
    std::vector<double> v25 = v15;
    const double v34 = v15[0];
    const double v27 = v16[0];
    v25[0] = v3;
    std::vector<double> v53 = v25;
    v15[0] = v14;
    double v50 = v20;
    v15[0] = v10;
    double v28 = v27;
    v15[0] = v27;
    v15[0] = v19;
    const double v39 = v25[0];
    const double v40 = v53[0];
    std::vector<double> v56 = v16;
    std::vector<double> v43 = v56;
    std::vector<double> v48 = v43;
    v48[0] = v39;
    const double v42 = v48[0];
    v15[0] = v6;
    const double v72 = v53[0];
    double v26 = v3;
    v25 = v15;
    double v49 = v22;
    v56[0] = v40;
    v48[0] = v7;
    double v32 = v42;
    v48[0] = v26;
    const double v67 = v48[0];
    v48[0] = v40;
    v48 = v56;
    v15[0] = v72;
    double v52 = v22;
    v25[0] = v50;
    v48[0] = v22;
    v19 = v50;
    v15[0] = v32;
    const std::vector<double> v60 { v8, v23, v14, v17, v34, v49, v52 };
    v53[0] = v40;
    std::vector<double> v61 = v60;
    v43[0] = v34;
    v53[0] = v35;
    v15[0] = v72;
    v56[0] = v28;
    const double v63 = v61[4];
    const double v91 = v42 - v26;
    v43[0] = v67;
    v15[0] = v11;
    v25[0] = v39;
    v53[0] = v63;
    v61[2] = v6;
    return v91;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s4>> &v0, const double &v1) {
    const double v6 = f24(v1);
    const double v5 = v6 - v1;
    const double v18 = v6 + v1;
    const double v24 = f24(v1);
    const double v44 = v6 * v18;
    const double v68 = v24 * v24;
    const double v81 = v44 / v5;
    const double v224 = v68 / v81;
    return v224;
  }
  int main() {
    std::vector<std::vector<s4>> v0({ { { { { { { { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } } }, { { { { { 4.0 }, { 5.0 } }, { { 6.0 }, { 7.0 } } }, { { { 8.0 }, { 9.0 } }, { { 10.0 }, { 11.0 } } }, { { { 12.0 }, { 13.0 } }, { { 14.0 }, { 15.0 } } } }, { { { { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } } } } }, { { { { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 } } }, { { { { { 24.0 }, { 25.0 } }, { { 26.0 }, { 27.0 } } }, { { { 28.0 }, { 29.0 } }, { { 30.0 }, { 31.0 } } }, { { { 32.0 }, { 33.0 } }, { { 34.0 }, { 35.0 } } } }, { { { { 36.0 }, { 37.0 } }, { { 38.0 }, { 39.0 } } } } } }, { { { { 40.0 }, { 41.0 } }, { { 42.0 }, { 43.0 } } }, { { { { { 44.0 }, { 45.0 } }, { { 46.0 }, { 47.0 } } }, { { { 48.0 }, { 49.0 } }, { { 50.0 }, { 51.0 } } }, { { { 52.0 }, { 53.0 } }, { { 54.0 }, { 55.0 } } } }, { { { { 56.0 }, { 57.0 } }, { { 58.0 }, { 59.0 } } } } } } }, { { { { 60.0 }, { 61.0 } }, { { 62.0 }, { 63.0 } } }, { { { { { 64.0 }, { 65.0 } }, { { 66.0 }, { 67.0 } } }, { { { 68.0 }, { 69.0 } }, { { 70.0 }, { 71.0 } } }, { { { 72.0 }, { 73.0 } }, { { 74.0 }, { 75.0 } } } }, { { { { 76.0 }, { 77.0 } }, { { 78.0 }, { 79.0 } } } } } } } } }, { { { { { 80.0 }, { 81.0 } }, { { 82.0 }, { 83.0 } } }, { { { 84.0 }, { 85.0 } }, { { 86.0 }, { 87.0 } } }, { { { 88.0 }, { 89.0 } }, { { 90.0 }, { 91.0 } } } }, { { { { 92.0 }, { 93.0 } }, { { 94.0 }, { 95.0 } } } } }, { { { 96.0 }, { 97.0 } }, { { 98.0 }, { 99.0 } } }, { { { { 100.0 }, { 101.0 } }, { { 102.0 }, { 103.0 } } }, { { { { { 104.0 }, { 105.0 } }, { { 106.0 }, { 107.0 } } }, { { { 108.0 }, { 109.0 } }, { { 110.0 }, { 111.0 } } }, { { { 112.0 }, { 113.0 } }, { { 114.0 }, { 115.0 } } } }, { { { { 116.0 }, { 117.0 } }, { { 118.0 }, { 119.0 } } } } } }, { { { { { 120.0 }, { 121.0 } }, { { 122.0 }, { 123.0 } } }, { { { 124.0 }, { 125.0 } }, { { 126.0 }, { 127.0 } } }, { { { 128.0 }, { 129.0 } }, { { 130.0 }, { 131.0 } } } }, { { { { 132.0 }, { 133.0 } }, { { 134.0 }, { 135.0 } } } } }, { { { { { { { { 136.0 }, { 137.0 } }, { { 138.0 }, { 139.0 } } }, { { { { { 140.0 }, { 141.0 } }, { { 142.0 }, { 143.0 } } }, { { { 144.0 }, { 145.0 } }, { { 146.0 }, { 147.0 } } }, { { { 148.0 }, { 149.0 } }, { { 150.0 }, { 151.0 } } } }, { { { { 152.0 }, { 153.0 } }, { { 154.0 }, { 155.0 } } } } } }, { { { { 156.0 }, { 157.0 } }, { { 158.0 }, { 159.0 } } }, { { { { { 160.0 }, { 161.0 } }, { { 162.0 }, { 163.0 } } }, { { { 164.0 }, { 165.0 } }, { { 166.0 }, { 167.0 } } }, { { { 168.0 }, { 169.0 } }, { { 170.0 }, { 171.0 } } } }, { { { { 172.0 }, { 173.0 } }, { { 174.0 }, { 175.0 } } } } } }, { { { { 176.0 }, { 177.0 } }, { { 178.0 }, { 179.0 } } }, { { { { { 180.0 }, { 181.0 } }, { { 182.0 }, { 183.0 } } }, { { { 184.0 }, { 185.0 } }, { { 186.0 }, { 187.0 } } }, { { { 188.0 }, { 189.0 } }, { { 190.0 }, { 191.0 } } } }, { { { { 192.0 }, { 193.0 } }, { { 194.0 }, { 195.0 } } } } } } }, { { { { 196.0 }, { 197.0 } }, { { 198.0 }, { 199.0 } } }, { { { { { 200.0 }, { 201.0 } }, { { 202.0 }, { 203.0 } } }, { { { 204.0 }, { 205.0 } }, { { 206.0 }, { 207.0 } } }, { { { 208.0 }, { 209.0 } }, { { 210.0 }, { 211.0 } } } }, { { { { 212.0 }, { 213.0 } }, { { 214.0 }, { 215.0 } } } } } } } } }, { { { { { { 216.0 }, { 217.0 } }, { { 218.0 }, { 219.0 } } }, { { { 220.0 }, { 221.0 } }, { { 222.0 }, { 223.0 } } }, { { { 224.0 }, { 225.0 } }, { { 226.0 }, { 227.0 } } } }, { { { { 228.0 }, { 229.0 } }, { { 230.0 }, { 231.0 } } } } } } } }, { { { { { { { { { { 232.0 }, { 233.0 } }, { { 234.0 }, { 235.0 } } }, { { { { { 236.0 }, { 237.0 } }, { { 238.0 }, { 239.0 } } }, { { { 240.0 }, { 241.0 } }, { { 242.0 }, { 243.0 } } }, { { { 244.0 }, { 245.0 } }, { { 246.0 }, { 247.0 } } } }, { { { { 248.0 }, { 249.0 } }, { { 250.0 }, { 251.0 } } } } } }, { { { { 252.0 }, { 253.0 } }, { { 254.0 }, { 255.0 } } }, { { { { { 256.0 }, { 257.0 } }, { { 258.0 }, { 259.0 } } }, { { { 260.0 }, { 261.0 } }, { { 262.0 }, { 263.0 } } }, { { { 264.0 }, { 265.0 } }, { { 266.0 }, { 267.0 } } } }, { { { { 268.0 }, { 269.0 } }, { { 270.0 }, { 271.0 } } } } } }, { { { { 272.0 }, { 273.0 } }, { { 274.0 }, { 275.0 } } }, { { { { { 276.0 }, { 277.0 } }, { { 278.0 }, { 279.0 } } }, { { { 280.0 }, { 281.0 } }, { { 282.0 }, { 283.0 } } }, { { { 284.0 }, { 285.0 } }, { { 286.0 }, { 287.0 } } } }, { { { { 288.0 }, { 289.0 } }, { { 290.0 }, { 291.0 } } } } } } }, { { { { 292.0 }, { 293.0 } }, { { 294.0 }, { 295.0 } } }, { { { { { 296.0 }, { 297.0 } }, { { 298.0 }, { 299.0 } } }, { { { 300.0 }, { 301.0 } }, { { 302.0 }, { 303.0 } } }, { { { 304.0 }, { 305.0 } }, { { 306.0 }, { 307.0 } } } }, { { { { 308.0 }, { 309.0 } }, { { 310.0 }, { 311.0 } } } } } } } } }, { { { { { 312.0 }, { 313.0 } }, { { 314.0 }, { 315.0 } } }, { { { 316.0 }, { 317.0 } }, { { 318.0 }, { 319.0 } } }, { { { 320.0 }, { 321.0 } }, { { 322.0 }, { 323.0 } } } }, { { { { 324.0 }, { 325.0 } }, { { 326.0 }, { 327.0 } } } } }, { { { 328.0 }, { 329.0 } }, { { 330.0 }, { 331.0 } } }, { { { { 332.0 }, { 333.0 } }, { { 334.0 }, { 335.0 } } }, { { { { { 336.0 }, { 337.0 } }, { { 338.0 }, { 339.0 } } }, { { { 340.0 }, { 341.0 } }, { { 342.0 }, { 343.0 } } }, { { { 344.0 }, { 345.0 } }, { { 346.0 }, { 347.0 } } } }, { { { { 348.0 }, { 349.0 } }, { { 350.0 }, { 351.0 } } } } } }, { { { { { 352.0 }, { 353.0 } }, { { 354.0 }, { 355.0 } } }, { { { 356.0 }, { 357.0 } }, { { 358.0 }, { 359.0 } } }, { { { 360.0 }, { 361.0 } }, { { 362.0 }, { 363.0 } } } }, { { { { 364.0 }, { 365.0 } }, { { 366.0 }, { 367.0 } } } } }, { { { { { { { { 368.0 }, { 369.0 } }, { { 370.0 }, { 371.0 } } }, { { { { { 372.0 }, { 373.0 } }, { { 374.0 }, { 375.0 } } }, { { { 376.0 }, { 377.0 } }, { { 378.0 }, { 379.0 } } }, { { { 380.0 }, { 381.0 } }, { { 382.0 }, { 383.0 } } } }, { { { { 384.0 }, { 385.0 } }, { { 386.0 }, { 387.0 } } } } } }, { { { { 388.0 }, { 389.0 } }, { { 390.0 }, { 391.0 } } }, { { { { { 392.0 }, { 393.0 } }, { { 394.0 }, { 395.0 } } }, { { { 396.0 }, { 397.0 } }, { { 398.0 }, { 399.0 } } }, { { { 400.0 }, { 401.0 } }, { { 402.0 }, { 403.0 } } } }, { { { { 404.0 }, { 405.0 } }, { { 406.0 }, { 407.0 } } } } } }, { { { { 408.0 }, { 409.0 } }, { { 410.0 }, { 411.0 } } }, { { { { { 412.0 }, { 413.0 } }, { { 414.0 }, { 415.0 } } }, { { { 416.0 }, { 417.0 } }, { { 418.0 }, { 419.0 } } }, { { { 420.0 }, { 421.0 } }, { { 422.0 }, { 423.0 } } } }, { { { { 424.0 }, { 425.0 } }, { { 426.0 }, { 427.0 } } } } } } }, { { { { 428.0 }, { 429.0 } }, { { 430.0 }, { 431.0 } } }, { { { { { 432.0 }, { 433.0 } }, { { 434.0 }, { 435.0 } } }, { { { 436.0 }, { 437.0 } }, { { 438.0 }, { 439.0 } } }, { { { 440.0 }, { 441.0 } }, { { 442.0 }, { 443.0 } } } }, { { { { 444.0 }, { 445.0 } }, { { 446.0 }, { 447.0 } } } } } } } } }, { { { { { { 448.0 }, { 449.0 } }, { { 450.0 }, { 451.0 } } }, { { { 452.0 }, { 453.0 } }, { { 454.0 }, { 455.0 } } }, { { { 456.0 }, { 457.0 } }, { { 458.0 }, { 459.0 } } } }, { { { { 460.0 }, { 461.0 } }, { { 462.0 }, { 463.0 } } } } } } } } });
    double v1(464.0);
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
