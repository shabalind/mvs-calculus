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
    var p1: s0
    var p2: s1
  }
  struct s3 {
    var p0: [s0]
    var p1: s2
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: Double) -> Double {
    let v5: [s0] = v0.p0
    let v3: s0 = v5[0]
    let v9: [[Double]] = v3.p1
    let v4: [Double] = v9[2]
    let v18: s0 = v5[0]
    let v13: [[Double]] = v18.p1
    let v19: [Double] = v13[1]
    let v26: Double = v19[0]
    let v34: Double = v26 * v1
    let v35: Double = v4[0]
    let v55: Double = v35 * v34
    return v55
  }
  func benchmark() {
    let v0: s3 = s3(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]]), s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0], [11.0]])], p1: s2(p0: [s1(p0: s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0], [16.0], [17.0]]), p1: s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0], [22.0], [23.0]])), s1(p0: s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0], [28.0], [29.0]]), p1: s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0], [35.0]]))], p1: s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0], [40.0], [41.0]]), p2: s1(p0: s0(p0: [[42.0], [43.0], [44.0]], p1: [[45.0], [46.0], [47.0]]), p1: s0(p0: [[48.0], [49.0], [50.0]], p1: [[51.0], [52.0], [53.0]]))))
    let v1: Double = 54.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 54.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
