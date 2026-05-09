package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.QuestionMarkThin: ImageVector
    get() {
        if (_QuestionMarkThin != null) {
            return _QuestionMarkThin!!
        }
        _QuestionMarkThin = ImageVector.Builder(
            name = "Thin.QuestionMarkThin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 160f)
                verticalLineTo(144f)
                curveToRelative(30.93f, 0f, 56f, -21.49f, 56f, -48f)
                reflectiveCurveToRelative(-25.07f, -48f, -56f, -48f)
                reflectiveCurveTo(72f, 69.49f, 72f, 96f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 208f)
                moveToRelative(-12f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -24f, 0f)
            }
        }.build()

        return _QuestionMarkThin!!
    }

@Suppress("ObjectPropertyName")
private var _QuestionMarkThin: ImageVector? = null
