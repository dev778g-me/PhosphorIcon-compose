package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.PaperclipBold: ImageVector
    get() {
        if (_PaperclipBold != null) {
            return _PaperclipBold!!
        }
        _PaperclipBold = ImageVector.Builder(
            name = "Bold.PaperclipBold",
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
                moveTo(96f, 176f)
                lineToRelative(95.8f, -92.2f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, -39.59f, -39.6f)
                lineTo(54.06f, 142.06f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 67.88f, 67.88f)
                lineTo(204f, 128f)
            }
        }.build()

        return _PaperclipBold!!
    }

@Suppress("ObjectPropertyName")
private var _PaperclipBold: ImageVector? = null
