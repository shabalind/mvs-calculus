  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: [[s0]]
  }
  @inline(never)
  func f0(_ v0: [[s1]], _ v1: [s1], _ v2: s0, _ v3: [s1], _ v4: Double, _ v5: s1) -> Double {
    let v11: [[s0]] = v5.p1
    let v18: [s0] = v11[1]
    let v21: [[Double]] = v2.p1
    var v27: Double = v4
    let v25: s0 = v18[0]
    let v29: [Double] = v21[0]
    let v33: [[Double]] = v25.p0
    var v46: [[Double]] = v33
    let v38: [Double] = v46[0]
    v46[0] = v29
    var v104: [Double] = v38
    let v233: Double = v104[0]
    v104[0] = v27
    return v233
  }
  func benchmark() {
    let v0: [[s1]] = [[s1(p0: [[s0(p0: [[0.0]], p1: [[1.0]])], [s0(p0: [[2.0]], p1: [[3.0]])]], p1: [[s0(p0: [[4.0]], p1: [[5.0]])], [s0(p0: [[6.0]], p1: [[7.0]])]])]]
    let v1: [s1] = [s1(p0: [[s0(p0: [[8.0]], p1: [[9.0]])], [s0(p0: [[10.0]], p1: [[11.0]])]], p1: [[s0(p0: [[12.0]], p1: [[13.0]])], [s0(p0: [[14.0]], p1: [[15.0]])]])]
    let v2: s0 = s0(p0: [[16.0]], p1: [[17.0]])
    let v3: [s1] = [s1(p0: [[s0(p0: [[18.0]], p1: [[19.0]])], [s0(p0: [[20.0]], p1: [[21.0]])]], p1: [[s0(p0: [[22.0]], p1: [[23.0]])], [s0(p0: [[24.0]], p1: [[25.0]])]]), s1(p0: [[s0(p0: [[26.0]], p1: [[27.0]])], [s0(p0: [[28.0]], p1: [[29.0]])]], p1: [[s0(p0: [[30.0]], p1: [[31.0]])], [s0(p0: [[32.0]], p1: [[33.0]])]]), s1(p0: [[s0(p0: [[34.0]], p1: [[35.0]])], [s0(p0: [[36.0]], p1: [[37.0]])]], p1: [[s0(p0: [[38.0]], p1: [[39.0]])], [s0(p0: [[40.0]], p1: [[41.0]])]])]
    let v4: Double = 42.0
    let v5: s1 = s1(p0: [[s0(p0: [[43.0]], p1: [[44.0]])], [s0(p0: [[45.0]], p1: [[46.0]])]], p1: [[s0(p0: [[47.0]], p1: [[48.0]])], [s0(p0: [[49.0]], p1: [[50.0]])]])
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = StructValue(Name(str='s1', ty=None), [[[StructValue(Name(str='s0', ty=None), [[[43.0]], [[44.0]]])], [StructValue(Name(str='s0', ty=None), [[[45.0]], [[46.0]]])]], [[StructValue(Name(str='s0', ty=None), [[[47.0]], [[48.0]]])], [StructValue(Name(str='s0', ty=None), [[[49.0]], [[50.0]]])]]])
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4, v5)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
