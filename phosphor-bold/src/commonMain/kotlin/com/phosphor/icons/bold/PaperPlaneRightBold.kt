package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.PaperPlaneRightBold: ImageVector
    get() {
        if (_PaperPlaneRightBold != null) {
            return _PaperPlaneRightBold!!
        }
        _PaperPlaneRightBold = ImageVector.Builder(
            name = "Bold.PaperPlaneRightBold",
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
                moveTo(144f, 128f)
                lineTo(80f, 128f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(48.49f, 221.28f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 59.93f, 231f)
                lineToRelative(168f, -96.09f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -14f)
                lineToRelative(-168f, -95.85f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.44f, 9.67f)
                lineTo(80f, 128f)
                close()
            }
        }.build()

        return _PaperPlaneRightBold!!
    }

@Suppress("ObjectPropertyName")
private var _PaperPlaneRightBold: ImageVector? = null
