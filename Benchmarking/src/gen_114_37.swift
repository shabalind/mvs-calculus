  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: s0
  }
  struct s2 {
    var p0: [[s0]]
    var p1: s0
  }
  struct s3 {
    var p0: s2
    var p1: s1
  }
  struct s4 {
    var p0: [s0]
    var p1: s2
  }
  struct s5 {
    var p0: s2
    var p1: [s0]
  }
  func f32(_ v0: [s1], _ v1: s4) -> s4 {
    let v6: s2 = v1.p1
    let v15: s2 = v1.p1
    let v30: [[s0]] = v6.p0
    let v72: [s0] = v30[0]
    let v150: s4 = s4(p0: v72, p1: v15)
    return v150
  }
  @inline(never)
  func f0(_ v0: s4, _ v1: s5, _ v2: s3, _ v3: s4, _ v4: Double, _ v5: [[s1]]) -> Double {
    let v8: s2 = v3.p1
    var v10: s4 = v3
    let v13: s0 = v8.p1
    let v16: [s1] = v5[1]
    let v26: [[Double]] = v13.p1
    let v27: s4 = f32(v16, v10)
    let v20: [Double] = v26[0]
    let v44: s2 = v27.p1
    let v60: [[s0]] = v44.p0
    let v50: [s0] = v60[0]
    let v51: Double = v20[0]
    v10.p1 = v8
    let v49: s0 = v50[0]
    let v41: [[Double]] = v49.p1
    let v43: [Double] = v41[0]
    let v114: Double = v43[0]
    let v148: Double = v51 + v114
    return v148
  }
  func benchmark() {
    let v0: s4 = s4(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]])], p1: s2(p0: [[s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]])]], p1: s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]])))
    let v1: s5 = s5(p0: s2(p0: [[s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]])]], p1: s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0]])), p1: [s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0]]), s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0]])])
    let v2: s3 = s3(p0: s2(p0: [[s0(p0: [[28.0], [29.0], [30.0]], p1: [[31.0]])]], p1: s0(p0: [[32.0], [33.0], [34.0]], p1: [[35.0]])), p1: s1(p0: [[s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0]])], [s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0]])], [s0(p0: [[44.0], [45.0], [46.0]], p1: [[47.0]])]], p1: s0(p0: [[48.0], [49.0], [50.0]], p1: [[51.0]])))
    let v3: s4 = s4(p0: [s0(p0: [[52.0], [53.0], [54.0]], p1: [[55.0]])], p1: s2(p0: [[s0(p0: [[56.0], [57.0], [58.0]], p1: [[59.0]])]], p1: s0(p0: [[60.0], [61.0], [62.0]], p1: [[63.0]])))
    let v4: Double = 64.0
    let v5: [[s1]] = [[s1(p0: [[s0(p0: [[65.0], [66.0], [67.0]], p1: [[68.0]])], [s0(p0: [[69.0], [70.0], [71.0]], p1: [[72.0]])], [s0(p0: [[73.0], [74.0], [75.0]], p1: [[76.0]])]], p1: s0(p0: [[77.0], [78.0], [79.0]], p1: [[80.0]]))], [s1(p0: [[s0(p0: [[81.0], [82.0], [83.0]], p1: [[84.0]])], [s0(p0: [[85.0], [86.0], [87.0]], p1: [[88.0]])], [s0(p0: [[89.0], [90.0], [91.0]], p1: [[92.0]])]], p1: s0(p0: [[93.0], [94.0], [95.0]], p1: [[96.0]]))]]
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = [[StructValue(Name(str='s1', ty=None), [[[StructValue(Name(str='s0', ty=None), [[[65.0], [66.0], [67.0]], [[68.0]]])], [StructValue(Name(str='s0', ty=None), [[[69.0], [70.0], [71.0]], [[72.0]]])], [StructValue(Name(str='s0', ty=None), [[[73.0], [74.0], [75.0]], [[76.0]]])]], StructValue(Name(str='s0', ty=None), [[[77.0], [78.0], [79.0]], [[80.0]]])])], [StructValue(Name(str='s1', ty=None), [[[StructValue(Name(str='s0', ty=None), [[[81.0], [82.0], [83.0]], [[84.0]]])], [StructValue(Name(str='s0', ty=None), [[[85.0], [86.0], [87.0]], [[88.0]]])], [StructValue(Name(str='s0', ty=None), [[[89.0], [90.0], [91.0]], [[92.0]]])]], StructValue(Name(str='s0', ty=None), [[[93.0], [94.0], [95.0]], [[96.0]]])])]]
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4, v5)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
