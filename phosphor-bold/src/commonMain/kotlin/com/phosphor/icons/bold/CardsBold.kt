package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.CardsBold: ImageVector
    get() {
        if (_CardsBold != null) {
            return _CardsBold!!
        }
        _CardsBold = ImageVector.Builder(
            name = "Bold.CardsBold",
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
                moveTo(36f, 84f)
                lineTo(180f, 84f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 188f, 92f)
                lineTo(188f, 204f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 180f, 212f)
                lineTo(36f, 212f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 28f, 204f)
                lineTo(28f, 92f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 36f, 84f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(64f, 44f)
                horizontalLineTo(220f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                verticalLineTo(176f)
            }
        }.build()

        return _CardsBold!!
    }

@Suppress("ObjectPropertyName")
private var _CardsBold: ImageVector? = null
