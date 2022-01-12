  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: [s0]
  }
  struct s2 {
    var p0: [[s1]]
    var p1: [s0]
  }
  struct s8 {
    var p0: s2
    var p1: [s1]
  }
  func f15(_ v0: s0) -> s0 {
    var v5: s0 = v0
    var v3: s0 = v0
    let v4: [[Double]] = v3.p1
    v5.p1 = v4
    var v7: s0 = v0
    var v6: [[Double]] = v4
    let v10: [[Double]] = v3.p1
    let v27: [[Double]] = v0.p1
    let v14: [[Double]] = v0.p1
    let v15: [[Double]] = v7.p1
    var v25: [[Double]] = v14
    let v22: [Double] = v27[0]
    v7.p1 = v10
    let v54: [Double] = v27[0]
    let v32: [[Double]] = v7.p0
    v6[0] = v22
    v7.p2 = v15
    v7.p2 = v4
    let v86: [[Double]] = v5.p0
    let v42: [Double] = v86[0]
    v25[0] = v54
    let v47: s0 = s0(p0: v32, p1: v15, p2: v14)
    v7.p0 = v86
    let v87: [[Double]] = v3.p1
    v6[0] = v42
    v5.p1 = v25
    v3.p1 = v6
    v5.p2 = v87
    return v47
  }
  @inline(never)
  func f0(_ v0: s8, _ v1: Double, _ v2: s8) -> Double {
    let v5: s2 = v2.p0
    let v3: [s0] = v5.p1
    let v7: s0 = v3[1]
    let v4: s0 = v3[1]
    let v11: s0 = f15(v7)
    let v23: [[Double]] = v11.p0
    let v18: [Double] = v23[1]
    let v32: Double = v1 / v1
    let v40: [[Double]] = v4.p2
    let v25: Double = v18[0]
    let v77: [Double] = v40[0]
    let v78: Double = v77[0]
    let v86: Double = v32 / v25
    let v135: Double = v78 * v86
    return v135
  }
  func benchmark() {
    let v0: s8 = s8(p0: s2(p0: [[s1(p0: [[s0(p0: [[0.0], [1.0]], p1: [[2.0]], p2: [[3.0]])], [s0(p0: [[4.0], [5.0]], p1: [[6.0]], p2: [[7.0]])]], p1: [s0(p0: [[8.0], [9.0]], p1: [[10.0]], p2: [[11.0]])])], [s1(p0: [[s0(p0: [[12.0], [13.0]], p1: [[14.0]], p2: [[15.0]])], [s0(p0: [[16.0], [17.0]], p1: [[18.0]], p2: [[19.0]])]], p1: [s0(p0: [[20.0], [21.0]], p1: [[22.0]], p2: [[23.0]])])], [s1(p0: [[s0(p0: [[24.0], [25.0]], p1: [[26.0]], p2: [[27.0]])], [s0(p0: [[28.0], [29.0]], p1: [[30.0]], p2: [[31.0]])]], p1: [s0(p0: [[32.0], [33.0]], p1: [[34.0]], p2: [[35.0]])])]], p1: [s0(p0: [[36.0], [37.0]], p1: [[38.0]], p2: [[39.0]]), s0(p0: [[40.0], [41.0]], p1: [[42.0]], p2: [[43.0]])]), p1: [s1(p0: [[s0(p0: [[44.0], [45.0]], p1: [[46.0]], p2: [[47.0]])], [s0(p0: [[48.0], [49.0]], p1: [[50.0]], p2: [[51.0]])]], p1: [s0(p0: [[52.0], [53.0]], p1: [[54.0]], p2: [[55.0]])])])
    let v1: Double = 56.0
    let v2: s8 = s8(p0: s2(p0: [[s1(p0: [[s0(p0: [[57.0], [58.0]], p1: [[59.0]], p2: [[60.0]])], [s0(p0: [[61.0], [62.0]], p1: [[63.0]], p2: [[64.0]])]], p1: [s0(p0: [[65.0], [66.0]], p1: [[67.0]], p2: [[68.0]])])], [s1(p0: [[s0(p0: [[69.0], [70.0]], p1: [[71.0]], p2: [[72.0]])], [s0(p0: [[73.0], [74.0]], p1: [[75.0]], p2: [[76.0]])]], p1: [s0(p0: [[77.0], [78.0]], p1: [[79.0]], p2: [[80.0]])])], [s1(p0: [[s0(p0: [[81.0], [82.0]], p1: [[83.0]], p2: [[84.0]])], [s0(p0: [[85.0], [86.0]], p1: [[87.0]], p2: [[88.0]])]], p1: [s0(p0: [[89.0], [90.0]], p1: [[91.0]], p2: [[92.0]])])]], p1: [s0(p0: [[93.0], [94.0]], p1: [[95.0]], p2: [[96.0]]), s0(p0: [[97.0], [98.0]], p1: [[99.0]], p2: [[100.0]])]), p1: [s1(p0: [[s0(p0: [[101.0], [102.0]], p1: [[103.0]], p2: [[104.0]])], [s0(p0: [[105.0], [106.0]], p1: [[107.0]], p2: [[108.0]])]], p1: [s0(p0: [[109.0], [110.0]], p1: [[111.0]], p2: [[112.0]])])])
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = StructValue(Name(str='s8', ty=None), [StructValue(Name(str='s2', ty=None), [[[StructValue(Name(str='s1', ty=None), [[[StructValue(Name(str='s0', ty=None), [[[57.0], [58.0]], [[59.0]], [[60.0]]])], [StructValue(Name(str='s0', ty=None), [[[61.0], [62.0]], [[63.0]], [[64.0]]])]], [StructValue(Name(str='s0', ty=None), [[[65.0], [66.0]], [[67.0]], [[68.0]]])]])], [StructValue(Name(str='s1', ty=None), [[[StructValue(Name(str='s0', ty=None), [[[69.0], [70.0]], [[71.0]], [[72.0]]])], [StructValue(Name(str='s0', ty=None), [[[73.0], [74.0]], [[75.0]], [[76.0]]])]], [StructValue(Name(str='s0', ty=None), [[[77.0], [78.0]], [[79.0]], [[80.0]]])]])], [StructValue(Name(str='s1', ty=None), [[[StructValue(Name(str='s0', ty=None), [[[81.0], [82.0]], [[83.0]], [[84.0]]])], [StructValue(Name(str='s0', ty=None), [[[85.0], [86.0]], [[87.0]], [[88.0]]])]], [StructValue(Name(str='s0', ty=None), [[[89.0], [90.0]], [[91.0]], [[92.0]]])]])]], [StructValue(Name(str='s0', ty=None), [[[93.0], [94.0]], [[95.0]], [[96.0]]]), StructValue(Name(str='s0', ty=None), [[[97.0], [98.0]], [[99.0]], [[100.0]]])]]), [StructValue(Name(str='s1', ty=None), [[[StructValue(Name(str='s0', ty=None), [[[101.0], [102.0]], [[103.0]], [[104.0]]])], [StructValue(Name(str='s0', ty=None), [[[105.0], [106.0]], [[107.0]], [[108.0]]])]], [StructValue(Name(str='s0', ty=None), [[[109.0], [110.0]], [[111.0]], [[112.0]]])]])]])
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
