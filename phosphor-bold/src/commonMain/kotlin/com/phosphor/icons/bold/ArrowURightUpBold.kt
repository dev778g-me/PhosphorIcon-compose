package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.ArrowURightUpBold: ImageVector
    get() {
        if (_ArrowURightUpBold != null) {
            return _ArrowURightUpBold!!
        }
        _ArrowURightUpBold = ImageVector.Builder(
            name = "Bold.ArrowURightUpBold",
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
                moveTo(120f, 80f)
                lineToRelative(48f, -48f)
                lineToRelative(48f, 48f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(56f, 80f)
                verticalLineToRelative(88f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 56f)
                horizontalLineToRelative(0f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, -56f)
                verticalLineTo(32f)
            }
        }.build()

        return _ArrowURightUpBold!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowURightUpBold: ImageVector? = null
