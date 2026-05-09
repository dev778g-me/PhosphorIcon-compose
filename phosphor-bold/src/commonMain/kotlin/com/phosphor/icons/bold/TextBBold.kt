package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.TextBBold: ImageVector
    get() {
        if (_TextBBold != null) {
            return _TextBBold!!
        }
        _TextBBold = ImageVector.Builder(
            name = "Bold.TextBBold",
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
                moveTo(80f, 120f)
                horizontalLineToRelative(80f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 80f)
                horizontalLineTo(80f)
                verticalLineTo(48f)
                horizontalLineToRelative(68f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 72f)
            }
        }.build()

        return _TextBBold!!
    }

@Suppress("ObjectPropertyName")
private var _TextBBold: ImageVector? = null
