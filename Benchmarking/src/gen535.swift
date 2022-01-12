  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: [s1]
    var p1: s1
  }
  struct s3 {
    var p0: s0
    var p1: [s1]
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: s2, _ v2: s3, _ v3: Double) -> Double {
    let v4: s0 = v2.p0
    let v8: s1 = v1.p1
    var v5: s1 = v8
    let v9: s0 = v8.p0
    v5.p0 = v4
    let v39: [s1] = [v5, v8, v5, v8]
    var v15: [s1] = v39
    v15[2] = v5
    let v25: s1 = v15[0]
    v5.p1 = v9
    let v19: s1 = v39[0]
    let v13: s0 = v25.p0
    let v46: [[Double]] = v13.p1
    v15[3] = v19
    let v31: [Double] = v46[0]
    let v65: Double = v31[0]
    return v65
  }
  func benchmark() {
    let v0: s2 = s2(p0: [s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]]), p1: s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]]))], p1: s1(p0: s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]]), p1: s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]])))
    let v1: s2 = s2(p0: [s1(p0: s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0]]), p1: s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0]]))], p1: s1(p0: s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0]]), p1: s0(p0: [[28.0], [29.0], [30.0]], p1: [[31.0]])))
    let v2: s3 = s3(p0: s0(p0: [[32.0], [33.0], [34.0]], p1: [[35.0]]), p1: [s1(p0: s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0]]), p1: s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0]]))])
    let v3: Double = 44.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 44.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
