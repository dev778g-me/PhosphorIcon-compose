package com.phosphor.icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Regular.TagSimple: ImageVector
    get() {
        if (_TagSimple != null) {
            return _TagSimple!!
        }
        _TagSimple = ImageVector.Builder(
            name = "Regular.TagSimple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(194.37f, 196.44f)
                lineTo(240f, 128f)
                lineTo(194.37f, 59.56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 187.72f, 56f)
                horizontalLineTo(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                verticalLineTo(192f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                horizontalLineTo(187.72f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 194.37f, 196.44f)
                close()
            }
        }.build()

        return _TagSimple!!
    }

@Suppress("ObjectPropertyName")
private var _TagSimple: ImageVector? = null
