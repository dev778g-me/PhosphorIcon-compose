package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.ListNumbersBold: ImageVector
    get() {
        if (_ListNumbersBold != null) {
            return _ListNumbersBold!!
        }
        _ListNumbersBold = ImageVector.Builder(
            name = "Bold.ListNumbersBold",
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
                moveTo(116f, 128f)
                lineTo(216f, 128f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(116f, 64f)
                lineTo(216f, 64f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(116f, 192f)
                lineTo(216f, 192f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(56f, 104f)
                lineToRelative(0f, -64f)
                lineToRelative(-16f, 8f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(72f, 208f)
                horizontalLineTo(40f)
                lineToRelative(28.68f, -38.37f)
                arcToRelative(15.69f, 15.69f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.24f, -22.41f)
                arcToRelative(16.78f, 16.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, -23.06f, 3.15f)
                arcToRelative(15.85f, 15.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.38f, 4.3f)
            }
        }.build()

        return _ListNumbersBold!!
    }

@Suppress("ObjectPropertyName")
private var _ListNumbersBold: ImageVector? = null
