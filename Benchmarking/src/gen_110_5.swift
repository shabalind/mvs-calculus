  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
  }
  struct s3 {
    var p0: [s1]
    var p1: s0
  }
  struct s7 {
    var p0: s3
    var p1: s1
  }
  @inline(never)
  func f0(_ v0: [s7], _ v1: Double) -> Double {
    let v3: s7 = v0[2]
    let v2: s3 = v3.p0
    let v5: s1 = v3.p1
    let v6: s0 = v5.p0
    let v10: s0 = v2.p1
    let v15: [[Double]] = v10.p1
    let v24: [[Double]] = v6.p0
    let v59: [Double] = v24[1]
    var v23: [[Double]] = v15
    let v33: [Double] = v23[1]
    let v28: Double = v33[0]
    v23[0] = v33
    v23[1] = v59
    var v48: Double = v28
    v23[1] = v59
    let v135: Double = v28 + v48
    return v135
  }
  func benchmark() {
    let v0: [s7] = [s7(p0: s3(p0: [s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]])), s1(p0: s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]]))], p1: s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]])), p1: s1(p0: s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0]]))), s7(p0: s3(p0: [s1(p0: s0(p0: [[16.0], [17.0]], p1: [[18.0], [19.0]])), s1(p0: s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0]]))], p1: s0(p0: [[24.0], [25.0]], p1: [[26.0], [27.0]])), p1: s1(p0: s0(p0: [[28.0], [29.0]], p1: [[30.0], [31.0]]))), s7(p0: s3(p0: [s1(p0: s0(p0: [[32.0], [33.0]], p1: [[34.0], [35.0]])), s1(p0: s0(p0: [[36.0], [37.0]], p1: [[38.0], [39.0]]))], p1: s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0]])), p1: s1(p0: s0(p0: [[44.0], [45.0]], p1: [[46.0], [47.0]])))]
    let v1: Double = 48.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 48.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
