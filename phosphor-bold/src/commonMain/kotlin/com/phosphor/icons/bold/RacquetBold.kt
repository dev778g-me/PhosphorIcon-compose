package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.RacquetBold: ImageVector
    get() {
        if (_RacquetBold != null) {
            return _RacquetBold!!
        }
        _RacquetBold = ImageVector.Builder(
            name = "Bold.RacquetBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(111.78f, 144.22f)
                arcToRelative(63.61f, 79.51f, 45f, isMoreThanHalf = true, isPositiveArc = false, 112.44f, -112.44f)
                arcToRelative(63.61f, 79.51f, 45f, isMoreThanHalf = true, isPositiveArc = false, -112.44f, 112.44f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22.34f, 201.66f)
                lineTo(53.65f, 170.34f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64.97f, 170.34f)
                lineTo(85.65f, 191.03f)
                arcTo(8f, 8f, 57.6f, isMoreThanHalf = false, isPositiveArc = true, 85.65f, 202.34f)
                lineTo(54.34f, 233.65f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 43.03f, 233.65f)
                lineTo(22.34f, 212.97f)
                arcTo(8f, 8f, 57.6f, isMoreThanHalf = false, isPositiveArc = true, 22.34f, 201.66f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(75.31f, 180.69f)
                lineTo(111.78f, 144.22f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(196f, 17.13f)
                lineTo(196f, 146.58f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(140f, 29.41f)
                lineTo(140f, 158.87f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(109.42f, 60f)
                lineTo(238.87f, 60f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(97.13f, 116f)
                lineTo(226.58f, 116f)
            }
        }.build()

        return _RacquetBold!!
    }

@Suppress("ObjectPropertyName")
private var _RacquetBold: ImageVector? = null
