package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.ArrowURightDownBold: ImageVector
    get() {
        if (_ArrowURightDownBold != null) {
            return _ArrowURightDownBold!!
        }
        _ArrowURightDownBold = ImageVector.Builder(
            name = "Bold.ArrowURightDownBold",
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
                moveTo(120f, 176f)
                lineToRelative(48f, 48f)
                lineToRelative(48f, -48f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(56f, 176f)
                verticalLineTo(88f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, -56f)
                horizontalLineToRelative(0f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 56f)
                verticalLineTo(224f)
            }
        }.build()

        return _ArrowURightDownBold!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowURightDownBold: ImageVector? = null
