  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s3 {
    var p0: Double
  }
  struct s4 {
    var p0: s0
    var p1: [s0]
  }
  struct s7 {
    var p0: s4
    var p1: s3
  }
  @inline(never)
  func f0(_ v0: [s7], _ v1: Double) -> Double {
    let v5: s3 = s3(p0: v1)
    var v12: Double = v1
    let v13: Double = v5.p0
    var v14: Double = v12
    var v30: s3 = v5
    let v40: Double = v30.p0
    let v32: Double = v1 - v14
    v30.p0 = v13
    let v45: Double = v12 / v12
    let v31: Double = v40 / v12
    v30.p0 = v32
    let v99: [Double] = [v31, v32, v32, v45]
    v30.p0 = v45
    let v128: Double = v99[0]
    return v128
  }
  func benchmark() {
    let v0: [s7] = [s7(p0: s4(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]]), p1: [s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]]), s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]]), s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]])]), p1: s3(p0: 16.0)), s7(p0: s4(p0: s0(p0: [[17.0]], p1: [[18.0], [19.0], [20.0]]), p1: [s0(p0: [[21.0]], p1: [[22.0], [23.0], [24.0]]), s0(p0: [[25.0]], p1: [[26.0], [27.0], [28.0]]), s0(p0: [[29.0]], p1: [[30.0], [31.0], [32.0]])]), p1: s3(p0: 33.0)), s7(p0: s4(p0: s0(p0: [[34.0]], p1: [[35.0], [36.0], [37.0]]), p1: [s0(p0: [[38.0]], p1: [[39.0], [40.0], [41.0]]), s0(p0: [[42.0]], p1: [[43.0], [44.0], [45.0]]), s0(p0: [[46.0]], p1: [[47.0], [48.0], [49.0]])]), p1: s3(p0: 50.0))]
    let v1: Double = 51.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 51.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
