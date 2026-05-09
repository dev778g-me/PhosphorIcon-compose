package com.phosphor.icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Regular.Rainbow: ImageVector
    get() {
        if (_Rainbow != null) {
            return _Rainbow!!
        }
        _Rainbow = ImageVector.Builder(
            name = "Regular.Rainbow",
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
                moveTo(176f, 184f)
                verticalLineTo(168f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -96f, 0f)
                verticalLineToRelative(16f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(208f, 184f)
                verticalLineTo(168f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, -160f, 0f)
                verticalLineToRelative(16f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(240f, 184f)
                verticalLineTo(168f)
                arcToRelative(112f, 112f, 0f, isMoreThanHalf = false, isPositiveArc = false, -224f, 0f)
                verticalLineToRelative(16f)
            }
        }.build()

        return _Rainbow!!
    }

@Suppress("ObjectPropertyName")
private var _Rainbow: ImageVector? = null
