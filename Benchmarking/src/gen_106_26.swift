  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [[s0]]
    var p2: s0
    var p3: s0
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: Double) -> Double {
    let v3: s1 = v0[0]
    let v4: s0 = v3.p2
    var v7: s0 = v4
    let v15: [[Double]] = v4.p0
    var v22: [[Double]] = v15
    v7.p1 = v22
    let v41: [[Double]] = v7.p0
    let v28: [[Double]] = v7.p1
    let v17: [[Double]] = v7.p1
    let v16: [Double] = v22[0]
    v7.p1 = v17
    v22[0] = v16
    var v36: [[Double]] = v15
    let v37: [Double] = v28[0]
    v22[0] = v37
    let v39: s0 = s0(p0: v36, p1: v17)
    v7 = v39
    v7.p1 = v41
    let v72: Double = v16[0]
    return v72
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: [s0(p0: [[0.0]], p1: [[1.0]]), s0(p0: [[2.0]], p1: [[3.0]]), s0(p0: [[4.0]], p1: [[5.0]])], p1: [[s0(p0: [[6.0]], p1: [[7.0]])]], p2: s0(p0: [[8.0]], p1: [[9.0]]), p3: s0(p0: [[10.0]], p1: [[11.0]])), s1(p0: [s0(p0: [[12.0]], p1: [[13.0]]), s0(p0: [[14.0]], p1: [[15.0]]), s0(p0: [[16.0]], p1: [[17.0]])], p1: [[s0(p0: [[18.0]], p1: [[19.0]])]], p2: s0(p0: [[20.0]], p1: [[21.0]]), p3: s0(p0: [[22.0]], p1: [[23.0]]))]
    let v1: Double = 24.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 24.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
