package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.CloudMoonBold: ImageVector
    get() {
        if (_CloudMoonBold != null) {
            return _CloudMoonBold!!
        }
        _CloudMoonBold = ImageVector.Builder(
            name = "Bold.CloudMoonBold",
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
                moveTo(104f, 144f)
                arcToRelative(68.06f, 68.06f, 0f, isMoreThanHalf = true, isPositiveArc = true, 68f, 72f)
                horizontalLineTo(92f)
                arcToRelative(44f, 44f, 0f, isMoreThanHalf = true, isPositiveArc = true, 14.2f, -85.66f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(64.38f, 137.75f)
                arcTo(64.14f, 64.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 29.62f, 94.38f)
                horizontalLineToRelative(0f)
                arcToRelative(64.06f, 64.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 76.76f, -76.76f)
                horizontalLineToRelative(0f)
                arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 156f, 80f)
                curveToRelative(0f, 0.63f, 0f, 1.27f, 0f, 1.9f)
            }
        }.build()

        return _CloudMoonBold!!
    }

@Suppress("ObjectPropertyName")
private var _CloudMoonBold: ImageVector? = null
