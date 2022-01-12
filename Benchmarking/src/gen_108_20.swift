  import Dispatch
  struct s0 {
    var p0: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s2 {
    var p0: s0
    var p1: s1
  }
  struct s4 {
    var p0: [s1]
    var p1: s1
  }
  struct s8 {
    var p0: [s0]
    var p1: [s4]
  }
  func f32(_ v0: Double) -> Double {
    var v2: Double = v0
    var v1: Double = v2
    var v10: Double = v0
    var v7: Double = v0
    var v5: Double = v1
    let v11: [Double] = [v5, v10, v7]
    var v9: Double = v7
    var v12: [Double] = v11
    var v18: Double = v1
    let v24: [[Double]] = [v11, v12, v11, v11]
    let v32: [Double] = v24[3]
    let v36: [Double] = v24[2]
    let v30: [Double] = v24[2]
    v12[0] = v10
    var v25: [[Double]] = v24
    var v16: [Double] = v32
    var v27: [Double] = v30
    let v17: [Double] = v25[3]
    var v19: [Double] = v27
    let v48: [Double] = v24[3]
    let v31: Double = v36[2]
    let v54: [Double] = v24[2]
    v12[2] = v31
    let v141: Double = v36[0]
    var v45: Double = v9
    var v34: [[Double]] = v25
    v25[0] = v17
    var v33: [[Double]] = v34
    var v50: [Double] = v19
    var v79: [Double] = v54
    v12[1] = v141
    let v40: [Double] = v33[0]
    v79[2] = v45
    v19[2] = v141
    v25[2] = v48
    v27[1] = v45
    v34[1] = v79
    v33[1] = v36
    let v95: Double = v40[2]
    v79[2] = v18
    v34[3] = v50
    v25[0] = v16
    return v95
  }
  func f16(_ v0: Double) -> Double {
    var v1: Double = v0
    var v7: Double = v1
    let v3: Double = f32(v7)
    var v10: Double = v3
    var v9: Double = v10
    let v23: Double = f32(v9)
    var v37: Double = v10
    var v55: Double = v37
    let v102: Double = v23 / v55
    return v102
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: [s8], _ v2: Double) -> Double {
    let v7: Double = f32(v2)
    let v9: Double = f32(v7)
    var v14: Double = v9
    let v104: Double = v14 + v2
    let v76: Double = f16(v104)
    return v76
  }
  func benchmark() {
    let v0: s2 = s2(p0: s0(p0: [[0.0], [1.0]]), p1: s1(p0: [s0(p0: [[2.0], [3.0]]), s0(p0: [[4.0], [5.0]]), s0(p0: [[6.0], [7.0]])], p1: s0(p0: [[8.0], [9.0]])))
    let v1: [s8] = [s8(p0: [s0(p0: [[10.0], [11.0]]), s0(p0: [[12.0], [13.0]])], p1: [s4(p0: [s1(p0: [s0(p0: [[14.0], [15.0]]), s0(p0: [[16.0], [17.0]]), s0(p0: [[18.0], [19.0]])], p1: s0(p0: [[20.0], [21.0]]))], p1: s1(p0: [s0(p0: [[22.0], [23.0]]), s0(p0: [[24.0], [25.0]]), s0(p0: [[26.0], [27.0]])], p1: s0(p0: [[28.0], [29.0]]))), s4(p0: [s1(p0: [s0(p0: [[30.0], [31.0]]), s0(p0: [[32.0], [33.0]]), s0(p0: [[34.0], [35.0]])], p1: s0(p0: [[36.0], [37.0]]))], p1: s1(p0: [s0(p0: [[38.0], [39.0]]), s0(p0: [[40.0], [41.0]]), s0(p0: [[42.0], [43.0]])], p1: s0(p0: [[44.0], [45.0]]))), s4(p0: [s1(p0: [s0(p0: [[46.0], [47.0]]), s0(p0: [[48.0], [49.0]]), s0(p0: [[50.0], [51.0]])], p1: s0(p0: [[52.0], [53.0]]))], p1: s1(p0: [s0(p0: [[54.0], [55.0]]), s0(p0: [[56.0], [57.0]]), s0(p0: [[58.0], [59.0]])], p1: s0(p0: [[60.0], [61.0]])))]), s8(p0: [s0(p0: [[62.0], [63.0]]), s0(p0: [[64.0], [65.0]])], p1: [s4(p0: [s1(p0: [s0(p0: [[66.0], [67.0]]), s0(p0: [[68.0], [69.0]]), s0(p0: [[70.0], [71.0]])], p1: s0(p0: [[72.0], [73.0]]))], p1: s1(p0: [s0(p0: [[74.0], [75.0]]), s0(p0: [[76.0], [77.0]]), s0(p0: [[78.0], [79.0]])], p1: s0(p0: [[80.0], [81.0]]))), s4(p0: [s1(p0: [s0(p0: [[82.0], [83.0]]), s0(p0: [[84.0], [85.0]]), s0(p0: [[86.0], [87.0]])], p1: s0(p0: [[88.0], [89.0]]))], p1: s1(p0: [s0(p0: [[90.0], [91.0]]), s0(p0: [[92.0], [93.0]]), s0(p0: [[94.0], [95.0]])], p1: s0(p0: [[96.0], [97.0]]))), s4(p0: [s1(p0: [s0(p0: [[98.0], [99.0]]), s0(p0: [[100.0], [101.0]]), s0(p0: [[102.0], [103.0]])], p1: s0(p0: [[104.0], [105.0]]))], p1: s1(p0: [s0(p0: [[106.0], [107.0]]), s0(p0: [[108.0], [109.0]]), s0(p0: [[110.0], [111.0]])], p1: s0(p0: [[112.0], [113.0]])))])]
    let v2: Double = 114.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 114.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
