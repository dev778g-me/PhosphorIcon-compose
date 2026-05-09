package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.SeatbeltBold: ImageVector
    get() {
        if (_SeatbeltBold != null) {
            return _SeatbeltBold!!
        }
        _SeatbeltBold = ImageVector.Builder(
            name = "Bold.SeatbeltBold",
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
                moveTo(128f, 68f)
                moveToRelative(-36f, 0f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = true, 72f, 0f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = true, -72f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(200f, 224f)
                lineToRelative(-144f, 0f)
                lineToRelative(136f, -112f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(193.67f, 162.44f)
                arcTo(71.51f, 71.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 199.56f, 184f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(59.71f, 169.13f)
                arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 108f, -37.17f)
            }
        }.build()

        return _SeatbeltBold!!
    }

@Suppress("ObjectPropertyName")
private var _SeatbeltBold: ImageVector? = null
