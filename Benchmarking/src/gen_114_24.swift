  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: Double
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: [s1]
    var p1: [s1]
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: s1, _ v2: Double) -> Double {
    let v4: [s1] = v0.p0
    let v9: s1 = v4[0]
    let v6: s1 = v4[1]
    let v23: s0 = v9.p0
    var v20: s1 = v6
    v20.p1 = v23
    v20.p0 = v23
    let v34: s0 = v20.p1
    let v65: [[Double]] = v34.p0
    let v60: [Double] = v65[0]
    let v22: Double = v60[0]
    let v48: s0 = s0(p0: v65, p1: v22)
    let v89: Double = v48.p1
    return v89
  }
  func benchmark() {
    let v0: s2 = s2(p0: [s1(p0: s0(p0: [[0.0]], p1: 1.0), p1: s0(p0: [[2.0]], p1: 3.0)), s1(p0: s0(p0: [[4.0]], p1: 5.0), p1: s0(p0: [[6.0]], p1: 7.0)), s1(p0: s0(p0: [[8.0]], p1: 9.0), p1: s0(p0: [[10.0]], p1: 11.0))], p1: [s1(p0: s0(p0: [[12.0]], p1: 13.0), p1: s0(p0: [[14.0]], p1: 15.0)), s1(p0: s0(p0: [[16.0]], p1: 17.0), p1: s0(p0: [[18.0]], p1: 19.0)), s1(p0: s0(p0: [[20.0]], p1: 21.0), p1: s0(p0: [[22.0]], p1: 23.0))])
    let v1: s1 = s1(p0: s0(p0: [[24.0]], p1: 25.0), p1: s0(p0: [[26.0]], p1: 27.0))
    let v2: Double = 28.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 28.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
